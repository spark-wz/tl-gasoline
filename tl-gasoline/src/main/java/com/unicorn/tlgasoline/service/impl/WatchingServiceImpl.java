package com.unicorn.tlgasoline.service.impl;

import com.unicorn.tlgasoline.common.DataSourceContextHolder;
import com.unicorn.tlgasoline.dao.WatchingMapper;
import com.unicorn.tlgasoline.entity.Watching;
import com.unicorn.tlgasoline.entity.WatchingExample;
import com.unicorn.tlgasoline.service.WatchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 15:36
 */
@Service
public class WatchingServiceImpl implements WatchingService {

	@Autowired
	private WatchingMapper watchingMapper;

	@Override
	public List<Watching> getWatchingList() {
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);

		WatchingExample watchingExample = new WatchingExample();
		watchingExample.setOrderByClause("HWH");

		return watchingMapper.selectByExample(watchingExample);
	}

	@Override
	public void syncWatchingList() {
		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
		WatchingExample watchingExample = new WatchingExample();
		watchingMapper.deleteByExample(watchingExample);

		//切换分库
		DataSourceContextHolder.setDB(DataSourceContextHolder.SQLSERVER_1);
		List<Watching> list = watchingMapper.selectByExample(watchingExample);

		//切换分库
		if(!list.isEmpty()){
			DataSourceContextHolder.setDB(DataSourceContextHolder.MYSQL);
			for(Watching t: list){
				watchingMapper.insert(t);
			}
		}

	}
}
