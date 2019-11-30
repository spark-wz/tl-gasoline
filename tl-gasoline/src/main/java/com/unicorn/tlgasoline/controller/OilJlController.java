package com.unicorn.tlgasoline.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicorn.tlgasoline.common.ServiceResult;
import com.unicorn.tlgasoline.dto.BaseQueryParam;
import com.unicorn.tlgasoline.entity.OilJl;
import com.unicorn.tlgasoline.service.OilJlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/8 15:02
 */
@RestController
@RequestMapping(value="/tlGasoline/OilJl")
public class OilJlController {

	@Autowired
	private OilJlService oilJlService;

	@RequestMapping(value="/getOilJlList")
	@ResponseBody
	public ServiceResult getOilJlList(@RequestBody BaseQueryParam param){
		//分页
		PageHelper.startPage(param.getPage(), param.getPageSize());
		List<OilJl> list = oilJlService.getOilJlList(param);
		PageInfo<OilJl> pageList = new PageInfo<>(list);
		return new ServiceResult(pageList);
	}
}
