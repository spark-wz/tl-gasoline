package com.unicorn.tlgasoline.service;

import com.unicorn.tlgasoline.dto.BaseQueryParam;
import com.unicorn.tlgasoline.entity.OilJl;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 14:48
 */
public interface OilJlService {
	/**
	 *列表查询
	 */
	List<OilJl> getOilJlList(BaseQueryParam param);

	/**
	 *数据同步
	 */
	void syncOilJl();

}
