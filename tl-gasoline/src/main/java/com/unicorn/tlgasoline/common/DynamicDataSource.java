package com.unicorn.tlgasoline.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 14:09
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
	@Override
	protected Object determineCurrentLookupKey() {

		System.out.println("数据源为"+DataSourceContextHolder.getDB());

		return DataSourceContextHolder.getDB();
	}

}


