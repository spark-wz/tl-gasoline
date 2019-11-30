package com.unicorn.tlgasoline.service.impl;

import com.github.pagehelper.PageHelper;
import com.unicorn.tlgasoline.common.DataSourceContextHolder;
import com.unicorn.tlgasoline.dao.OilJlMapper;
import com.unicorn.tlgasoline.dto.BaseQueryParam;
import com.unicorn.tlgasoline.entity.OilJl;
import com.unicorn.tlgasoline.entity.OilJlExample;
import com.unicorn.tlgasoline.service.OilJlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 14:57
 */
@Service
public class OilJlServiceImpl implements OilJlService {
	@Autowired
	private OilJlMapper oilJlMapper;

	@Override
	public List<OilJl> getOilJlList(BaseQueryParam param) {
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);

		OilJlExample oilJlExample = new OilJlExample();
		oilJlExample.setOrderByClause("FYDATE DESC, FYSTTIME DESC");
		OilJlExample.Criteria criteria = oilJlExample.createCriteria();
		if(!StringUtils.isEmpty(param.getStartTime())){
			criteria.andFydateGreaterThanOrEqualTo(param.getStartTime());
		}
		if(!StringUtils.isEmpty(param.getEndTime())){
			criteria.andFydateLessThanOrEqualTo(param.getEndTime());
		}
		if(param.getNumber() != null){
			criteria.andHwhEqualTo(param.getNumber().shortValue());
		}
		return oilJlMapper.selectByExample(oilJlExample);
	}

	@Override
	public void syncOilJl() {
		//获取最后一次ID
		Integer updateId = getLastId();
		//获取同步数据
		List<OilJl> updateList = getUpdateList(updateId);
		if(!updateList.isEmpty()){
			//切换分库
			DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
			//保存
			for(OilJl t: updateList){
				oilJlMapper.insert(t);
			}
		}
	}

	private Integer getLastId(){
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
		Integer updateId = 0;
		PageHelper.startPage(1, 1);
		OilJlExample oilJlExample = new OilJlExample();
		oilJlExample.setOrderByClause("ID DESC");
		List<OilJl> list = oilJlMapper.selectByExample(oilJlExample);
		if(!list.isEmpty()){
			updateId = list.get(0).getId();
		}
		return updateId;
	}

	private List<OilJl> getUpdateList(Integer updateId){
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.SQLSERVER_1);
		OilJlExample oilJlExample = new OilJlExample();
		oilJlExample.createCriteria().andIdGreaterThan(updateId);
		return oilJlMapper.selectByExample(oilJlExample);
	}
}
