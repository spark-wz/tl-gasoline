package com.unicorn.tlgasoline.config;

import com.unicorn.tlgasoline.common.DynamicDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/2 15:18
 * spring boot提供的简单创建数据源的办法
 * 使用哪种数据源类型，就要在pom里面加相应的依赖
 */
@Configuration
public class DataSourceConfig {


	/**
	 * 	主数据源
	 */
	@Bean(name = "mysqlDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.mysqldb")
	public DataSource mysqlDataSource() {
		return DataSourceBuilder.create().build();
	}


	/**
	 * 汽车发油数据源
	 */
	@Bean("sqlServer1DataSource")
	@ConfigurationProperties(prefix = "spring.datasource.sqlserver1db")
	public DataSource sqlServer1DataSource() {
		return DataSourceBuilder.create().build();
	}

	/**
	 * 水路数据源
	 */
	@Bean("sqlServer2DataSource")
	@ConfigurationProperties(prefix = "spring.datasource.sqlserver2db")
	public DataSource sqlServer2DataSource() {
		return DataSourceBuilder.create().build();
	}

	/**
	 * 铁路数据源
	 */
	@Bean("sqlServer3DataSource")
	@ConfigurationProperties(prefix = "spring.datasource.sqlserver3db")
	public DataSource sqlServer3DataSource() {
		return DataSourceBuilder.create().build();
	}

	/**
	 * 动态数据源: 通过AOP在不同数据源之间动态切换
	 * @return
	 */
	@Primary
	@Bean(name = "dynamicDataSource")
	public DataSource dynamicDataSource() {
		DynamicDataSource dynamicDataSource = new DynamicDataSource();
		// 默认数据源
		dynamicDataSource.setDefaultTargetDataSource(mysqlDataSource());
		// 配置多数据源
		Map<Object, Object> dsMap = new HashMap();
		dsMap.put("mysql", mysqlDataSource());
		dsMap.put("sqlServer1", sqlServer1DataSource());
		dsMap.put("sqlServer2", sqlServer2DataSource());
		dsMap.put("sqlServer3", sqlServer3DataSource());
		dynamicDataSource.setTargetDataSources(dsMap);
		return dynamicDataSource;
	}
	/**
	 * shengcheng构造函数
	 * @return
	 */
	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dynamicDataSource());
	}
}
