package com.unicorn.tlgasoline.common;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 14:16
 * 方法都是public和static，可以在别的类，通过类名点方法拿到
 */
public class DataSourceContextHolder {

	/**

	 * 默认数据源

	 */

	public static final String MYSQL = "msyql";

	public static final String SQLSERVER_1 = "sqlserver1";
	public static final String SQLSERVER_2 = "sqlServer2";
	public static final String SQLSERVER_3 = "sqlServer3";


	//ThreadLocal是一个线程内部的存储类，可以在既定线程内部存储数据
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();



	// 设置数据源名

	public static void setDB(String dbType) {

		System.out.println("切换到{"+dbType+"}数据源");

		contextHolder.set(dbType);

	}


	// 获取数据源名

	public static String getDB() {

		return (contextHolder.get());

	}



	// 清除数据源名

	public static void clearDB() {

		contextHolder.remove();

	}

}
