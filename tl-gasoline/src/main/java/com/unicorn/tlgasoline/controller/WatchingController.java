package com.unicorn.tlgasoline.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicorn.tlgasoline.common.ServiceResult;
import com.unicorn.tlgasoline.dto.BaseQueryParam;
import com.unicorn.tlgasoline.entity.Watching;
import com.unicorn.tlgasoline.service.WatchingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 15:32
 */
@RestController
@RequestMapping(value="/tlGasoline/watching")
public class WatchingController {

	@Autowired
	private WatchingService watchingService;

	@RequestMapping(value="/getWatchingList")
	@ResponseBody
	public ServiceResult getWatchingList(@RequestBody BaseQueryParam param){
		//分页
		PageHelper.startPage(param.getPage(), param.getPageSize());
		List<Watching> list = watchingService.getWatchingList();
		PageInfo<Watching> pageList = new PageInfo<>(list);
		return new ServiceResult(pageList);
	}
}
