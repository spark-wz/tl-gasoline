package com.unicorn.tlgasoline.dao;

import com.unicorn.tlgasoline.dto.BaseQueryParam;
import com.unicorn.tlgasoline.dto.SfyQueryParam;
import com.unicorn.tlgasoline.dto.SfyVo;
import com.unicorn.tlgasoline.entity.TieluSfy;
import com.unicorn.tlgasoline.entity.TieluSfyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TieluSfyMapper {
    int countByExample(TieluSfyExample example);

    int deleteByExample(TieluSfyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TieluSfy record);

    int insertSelective(TieluSfy record);

    List<TieluSfy> selectByExample(TieluSfyExample example);

    TieluSfy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TieluSfy record, @Param("example") TieluSfyExample example);

    int updateByExample(@Param("record") TieluSfy record, @Param("example") TieluSfyExample example);

    int updateByPrimaryKeySelective(TieluSfy record);

    int updateByPrimaryKey(TieluSfy record);

    List<TieluSfy> selectByTableName(@Param("param") SfyQueryParam param);

    List<SfyVo> selectTieluSfyVoList(@Param("param") BaseQueryParam param);
}