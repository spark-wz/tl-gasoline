package com.unicorn.tlgasoline.dto;

import lombok.Data;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 14:55
 */
@Data
public class BaseQueryParam {

	private String startTime;

	private String endTime;

	private Integer number;

	protected int page = 1;

	protected int pageSize = 20;
}
