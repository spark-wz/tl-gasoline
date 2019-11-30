package com.unicorn.tlgasoline.service.impl;

import com.github.pagehelper.PageHelper;
import com.unicorn.tlgasoline.common.DataSourceContextHolder;
import com.unicorn.tlgasoline.dao.ShuiluSfyMapper;
import com.unicorn.tlgasoline.dto.BaseQueryParam;
import com.unicorn.tlgasoline.dto.SfyQueryParam;
import com.unicorn.tlgasoline.dto.SfyVo;
import com.unicorn.tlgasoline.entity.ShuiluSfy;
import com.unicorn.tlgasoline.entity.ShuiluSfyExample;
import com.unicorn.tlgasoline.service.ShuiluSfyService;
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
public class ShuiluSfyServiceImpl implements ShuiluSfyService {

	@Autowired
	private ShuiluSfyMapper shuiluSfyMapper;

	private String[] tableNames = {"SHUILU_SFY1","SHUILU_SFY2","SHUILU_SFY3"};

	@Override
	public List<ShuiluSfy> getShuiluSfyList(BaseQueryParam param) {
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
		ShuiluSfyExample shuiluSfyExample = new ShuiluSfyExample();
		shuiluSfyExample.setOrderByClause("start_time desc");
		ShuiluSfyExample.Criteria criteria = shuiluSfyExample.createCriteria();
		if(!StringUtils.isEmpty(param.getStartTime())){
			criteria.andTimeGreaterThanOrEqualTo(param.getStartTime());
		}
		if(!StringUtils.isEmpty(param.getEndTime())){
			criteria.andTimeLessThanOrEqualTo(param.getEndTime());
		}
		if(param.getNumber() != null){
			criteria.andSfyEqualTo(param.getNumber().byteValue());
		}
		return shuiluSfyMapper.selectByExample(shuiluSfyExample);
	}

	@Override
	public void syncShuiluSfyList() {
		String lastTime = getLastTime();
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.SQLSERVER_2);
		SfyQueryParam sfyQueryParam = new SfyQueryParam();
		sfyQueryParam.setTime(lastTime);
		List<ShuiluSfy> insertList = new ArrayList<>();
		Integer type = 0;

		for(String str: tableNames){
			type ++ ;
			sfyQueryParam.setTableName(str);
			List<ShuiluSfy> list = shuiluSfyMapper.selectByTableName(sfyQueryParam);
			list = list.stream().filter( x -> !check(x)).collect(Collectors.toList());
			if(!list.isEmpty()){
				insertList.addAll(buildShuiluSfy(list, type));
			}
		}

		insert(insertList);

	}

	@Override
	public List<SfyVo> getShuiluSfyVoList(BaseQueryParam param) {
		return shuiluSfyMapper.selectShuiluSfyVoList(param);
	}

	private String getLastTime(){
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
		String lastTime = "";
		PageHelper.startPage(1, 1);
		ShuiluSfyExample shuiluSfyExample = new ShuiluSfyExample();
		shuiluSfyExample.setOrderByClause("Time DESC");
		List<ShuiluSfy> list = shuiluSfyMapper.selectByExample(shuiluSfyExample);
		if(!list.isEmpty()){
			lastTime = list.get(0).getTime();
		}
		return lastTime;
	}

	private void insert(List<ShuiluSfy> insertList){
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
		for(ShuiluSfy t:insertList){
			shuiluSfyMapper.insert(t);
		}
	}

	private List<ShuiluSfy> buildShuiluSfy(List<ShuiluSfy> list, Integer sfy){
		BigDecimal startLeiji = BigDecimal.ZERO;
		BigDecimal endLeiji = BigDecimal.ZERO;
		List<ShuiluSfy> insertList = new ArrayList<>();
		ShuiluSfy shuiluSfy = null;
		for(ShuiluSfy t: list) {
			//节点判断
			if (new BigDecimal(t.getLiusu()).compareTo(BigDecimal.ZERO) == 0){
				if(shuiluSfy != null){
					shuiluSfy.setLeiji(t.getLeiji());
					endLeiji = new BigDecimal(t.getLeiji());
					//发油
					if(startLeiji.compareTo(endLeiji) == 1){
						shuiluSfy.setType(true);
						shuiluSfy.setThisCumulative(startLeiji.subtract(endLeiji).divide(new BigDecimal(1000),2, BigDecimal.ROUND_HALF_UP));
						insertList.add(shuiluSfy);
					}else if(startLeiji.compareTo(endLeiji) == -1){//收油
						shuiluSfy.setType(false);
						shuiluSfy.setThisCumulative(endLeiji.subtract(startLeiji).divide(new BigDecimal(1000),2, BigDecimal.ROUND_HALF_UP));
						insertList.add(shuiluSfy);
					}
				}
				if(new BigDecimal(t.getLeiji()).compareTo(BigDecimal.ZERO) != 0){
					startLeiji = new BigDecimal(t.getLeiji());
				}else{
					startLeiji = BigDecimal.ZERO;
				}
				endLeiji = BigDecimal.ZERO;
				shuiluSfy = null;
			}else{
				if(shuiluSfy == null){
					shuiluSfy = new ShuiluSfy();
					shuiluSfy.setStartTime(t.getTime());
					if(startLeiji.compareTo(BigDecimal.ZERO) == 0){
						startLeiji = new BigDecimal(t.getLeiji());
					}
				}
				shuiluSfy.setSfy(sfy.byteValue());
				shuiluSfy.setTime(t.getTime());
				shuiluSfy.setLiusu(t.getLiusu());
				shuiluSfy.setMidu(t.getMidu());
				shuiluSfy.setWendu(t.getWendu());
				shuiluSfy.setLeiji(t.getLeiji());
				endLeiji = new BigDecimal(t.getLeiji());
			}

		}
		return insertList;
	}

	private Boolean check(ShuiluSfy x){
		return (new BigDecimal(x.getMidu()).compareTo(BigDecimal.ZERO) == 0
		&& new BigDecimal(x.getWendu()).compareTo(BigDecimal.ZERO) == 0)
				|| (new BigDecimal(x.getMidu()).compareTo(new BigDecimal("-9999")) == 0
				&& new BigDecimal(x.getWendu()).compareTo(new BigDecimal("-9999")) == 0);
	}
}
