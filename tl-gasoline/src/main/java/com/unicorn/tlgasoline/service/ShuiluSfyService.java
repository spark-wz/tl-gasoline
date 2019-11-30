package com.unicorn.tlgasoline.service;

import com.unicorn.tlgasoline.dto.BaseQueryParam;
import com.unicorn.tlgasoline.dto.SfyVo;
import com.unicorn.tlgasoline.entity.ShuiluSfy;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 22:34
 */
public interface ShuiluSfyService {
	/**
	 *查询数据
	 */
	List<ShuiluSfy> getShuiluSfyList(BaseQueryParam param);
	/**
	 *同步数据
	 */
	void syncShuiluSfyList();

	/**
	 *查询数据汇总
	 */
	List<SfyVo> getShuiluSfyVoList(BaseQueryParam param);
}
