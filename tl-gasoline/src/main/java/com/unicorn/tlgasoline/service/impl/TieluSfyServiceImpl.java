package com.unicorn.tlgasoline.service.impl;

import com.github.pagehelper.PageHelper;
import com.unicorn.tlgasoline.common.DataSourceContextHolder;
import com.unicorn.tlgasoline.dao.TieluSfyMapper;
import com.unicorn.tlgasoline.dto.BaseQueryParam;
import com.unicorn.tlgasoline.dto.SfyQueryParam;
import com.unicorn.tlgasoline.dto.SfyVo;
import com.unicorn.tlgasoline.entity.TieluSfy;
import com.unicorn.tlgasoline.entity.TieluSfyExample;
import com.unicorn.tlgasoline.service.TieluSfyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 22:35
 */
@Service
public class TieluSfyServiceImpl implements TieluSfyService {

	@Autowired
	private TieluSfyMapper tieluSfyMapper;

	private String[] tableNames = {"TIELU_SFY1","TIELU_SFY2","TIELU_SFY3","TIELU_SFY4","TIELU_SFY5"};

	@Override
	public List<TieluSfy> getTieluSfyList(BaseQueryParam param) {
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
		TieluSfyExample tieluSfyExample = new TieluSfyExample();
		tieluSfyExample.setOrderByClause("start_time desc");
		TieluSfyExample.Criteria criteria = tieluSfyExample.createCriteria();
		if(!StringUtils.isEmpty(param.getStartTime())){
			criteria.andTimeGreaterThanOrEqualTo(param.getStartTime());
		}
		if(!StringUtils.isEmpty(param.getEndTime())){
			criteria.andTimeLessThanOrEqualTo(param.getEndTime());
		}
		if(param.getNumber() != null){
			criteria.andSfyEqualTo(param.getNumber().byteValue());
		}
		return tieluSfyMapper.selectByExample(tieluSfyExample);
	}

	@Override
	public void syncTieluSfyList() {
		String lastTime = getLastTime();
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.SQLSERVER_3);
		SfyQueryParam sfyQueryParam = new SfyQueryParam();
		sfyQueryParam.setTime(lastTime);
		List<TieluSfy> insertList = new ArrayList<>();
		Integer type = 0;

		for(String str: tableNames){
			type ++ ;
			sfyQueryParam.setTableName(str);
			List<TieluSfy> list = tieluSfyMapper.selectByTableName(sfyQueryParam);
			list = list.stream().filter( x -> !check(x)).collect(Collectors.toList());
			if(!list.isEmpty()){
				insertList.addAll(buildTieluSfy(list, type));
			}
		}

		insert(insertList);

	}

	@Override
	public List<SfyVo> getTieluSfyVoList(BaseQueryParam param) {
		return tieluSfyMapper.selectTieluSfyVoList(param);
	}

	private String getLastTime(){
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
		String lastTime = "";
		PageHelper.startPage(1, 1);
		TieluSfyExample tieluSfyExample = new TieluSfyExample();
		tieluSfyExample.setOrderByClause("Time DESC");
		List<TieluSfy> list = tieluSfyMapper.selectByExample(tieluSfyExample);
		if(!list.isEmpty()){
			lastTime = list.get(0).getTime();
		}
		return lastTime;
	}

	private void insert(List<TieluSfy> insertList){
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
		for(TieluSfy t:insertList){
			tieluSfyMapper.insert(t);
		}
	}

	private List<TieluSfy> buildTieluSfy(List<TieluSfy> list, Integer sfy){
		BigDecimal startLeiji = BigDecimal.ZERO;
		BigDecimal endLeiji = BigDecimal.ZERO;
		List<TieluSfy> insertList = new ArrayList<>();
		TieluSfy tieluSfy = null;
		for(TieluSfy t: list) {
			//节点判断
			if (new BigDecimal(t.getLiusu()).compareTo(BigDecimal.ZERO) == 0){
				if(tieluSfy != null){
					tieluSfy.setLeiji(t.getLeiji());
					endLeiji = new BigDecimal(t.getLeiji());
					//发油
					if(startLeiji.compareTo(endLeiji) == 1){
						tieluSfy.setType(true);
						tieluSfy.setThisCumulative(startLeiji.subtract(endLeiji).divide(new BigDecimal(1000),2, BigDecimal.ROUND_HALF_UP));
						insertList.add(tieluSfy);
					}else if(startLeiji.compareTo(endLeiji) == -1){//收油
						tieluSfy.setType(false);
						tieluSfy.setThisCumulative(endLeiji.subtract(startLeiji).divide(new BigDecimal(1000),2, BigDecimal.ROUND_HALF_UP));
						insertList.add(tieluSfy);
					}
				}
				if(new BigDecimal(t.getLeiji()).compareTo(BigDecimal.ZERO) != 0){
					startLeiji = new BigDecimal(t.getLeiji());
				}else{
					startLeiji = BigDecimal.ZERO;
				}
				endLeiji = BigDecimal.ZERO;
				tieluSfy = null;
			}else{
				if(tieluSfy == null){
					tieluSfy = new TieluSfy();
					tieluSfy.setStartTime(t.getTime());
					if(startLeiji.compareTo(BigDecimal.ZERO) == 0){
						startLeiji = new BigDecimal(t.getLeiji());
					}
				}
				tieluSfy.setSfy(sfy.byteValue());
				tieluSfy.setTime(t.getTime());
				tieluSfy.setLiusu(t.getLiusu());
				tieluSfy.setMidu(t.getMidu());
				tieluSfy.setWendu(t.getWendu());
				tieluSfy.setLeiji(t.getLeiji());
				endLeiji = new BigDecimal(t.getLeiji());
			}

		}
		return insertList;
	}


	private Boolean check(TieluSfy x){
		return (new BigDecimal(x.getMidu()).compareTo(BigDecimal.ZERO) == 0
				&& new BigDecimal(x.getWendu()).compareTo(BigDecimal.ZERO) == 0)
				|| (new BigDecimal(x.getMidu()).compareTo(new BigDecimal("-9999")) == 0
				&& new BigDecimal(x.getWendu()).compareTo(new BigDecimal("-9999")) == 0);
	}
}
