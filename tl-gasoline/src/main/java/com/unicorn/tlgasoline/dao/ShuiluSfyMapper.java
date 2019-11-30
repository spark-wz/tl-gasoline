package com.unicorn.tlgasoline.dao;

import com.unicorn.tlgasoline.dto.BaseQueryParam;
import com.unicorn.tlgasoline.dto.SfyQueryParam;
import com.unicorn.tlgasoline.dto.SfyVo;
import com.unicorn.tlgasoline.entity.ShuiluSfy;
import com.unicorn.tlgasoline.entity.ShuiluSfyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShuiluSfyMapper {
    int countByExample(ShuiluSfyExample example);

    int deleteByExample(ShuiluSfyExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ShuiluSfy record);

    int insertSelective(ShuiluSfy record);

    List<ShuiluSfy> selectByExample(ShuiluSfyExample example);

    ShuiluSfy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ShuiluSfy record, @Param("example") ShuiluSfyExample example);

    int updateByExample(@Param("record") ShuiluSfy record, @Param("example") ShuiluSfyExample example);

    int updateByPrimaryKeySelective(ShuiluSfy record);

    int updateByPrimaryKey(ShuiluSfy record);

    List<ShuiluSfy> selectByTableName(@Param("param") SfyQueryParam param);

    List<SfyVo> selectShuiluSfyVoList(@Param("param") BaseQueryParam param);
}