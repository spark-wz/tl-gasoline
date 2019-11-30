package com.unicorn.tlgasoline.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicorn.tlgasoline.common.ServiceResult;
import com.unicorn.tlgasoline.dto.BaseQueryParam;
import com.unicorn.tlgasoline.dto.SfyViewVo;
import com.unicorn.tlgasoline.dto.SfyVo;
import com.unicorn.tlgasoline.entity.ShuiluSfy;
import com.unicorn.tlgasoline.service.ShuiluSfyService;
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
@RequestMapping(value="/tlGasoline/ShuiluSfy")
public class ShuiluSfyController {

	@Autowired
	private ShuiluSfyService shuiluSfyService;

	@RequestMapping(value="/getShuiluSfyView")
	@ResponseBody
	public ServiceResult getShuiluSfyView(@RequestBody BaseQueryParam param){
		//分页
		PageHelper.startPage(param.getPage(), param.getPageSize());
		List<ShuiluSfy> list = shuiluSfyService.getShuiluSfyList(param);
		PageInfo<ShuiluSfy> pageList = new PageInfo<>(list);
		SfyViewVo vo = new SfyViewVo();
		vo.setShuiluList(pageList);

		List<SfyVo> listVo = shuiluSfyService.getShuiluSfyVoList(param);
		vo.setSfyList(listVo);
		return new ServiceResult(vo);
	}

}
