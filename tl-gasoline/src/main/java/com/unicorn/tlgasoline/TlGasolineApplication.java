package com.unicorn.tlgasoline;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})//多数据原配置
@MapperScan("com.unicorn.tlgasoline.dao") //指定要扫描的Mapper类的包的路径
public class TlGasolineApplication {

	public static void main(String[] args) {
		SpringApplication.run(TlGasolineApplication.class, args);
	}

}
