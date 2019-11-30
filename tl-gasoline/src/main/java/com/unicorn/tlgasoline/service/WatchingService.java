package com.unicorn.tlgasoline.service;

import com.unicorn.tlgasoline.entity.Watching;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 15:33
 */
public interface WatchingService {

	/**
	 *列表查询
	 */
	List<Watching> getWatchingList();

	/**
	 *同步数据
	 */
	void syncWatchingList();
}
