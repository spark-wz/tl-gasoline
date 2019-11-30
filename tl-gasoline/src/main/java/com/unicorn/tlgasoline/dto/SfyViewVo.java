package com.unicorn.tlgasoline.dto;

import com.github.pagehelper.PageInfo;
import com.unicorn.tlgasoline.entity.ShuiluSfy;
import com.unicorn.tlgasoline.entity.TieluSfy;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author Mr.MiaoTai
 * @version 1.0
 * @date 2019/11/9 0:23
 */
@Data
public class SfyViewVo implements Serializable {

	private PageInfo<ShuiluSfy> shuiluList;

	private PageInfo<TieluSfy> tieluList;

	private List<SfyVo> sfyList;
}
