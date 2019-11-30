package com.unicorn.tlgasoline.dao;

import com.unicorn.tlgasoline.entity.OilJl;
import com.unicorn.tlgasoline.entity.OilJlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OilJlMapper {
    int countByExample(OilJlExample example);

    int deleteByExample(OilJlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OilJl record);

    int insertSelective(OilJl record);

    List<OilJl> selectByExample(OilJlExample example);

    OilJl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OilJl record, @Param("example") OilJlExample example);

    int updateByExample(@Param("record") OilJl record, @Param("example") OilJlExample example);

    int updateByPrimaryKeySelective(OilJl record);

    int updateByPrimaryKey(OilJl record);
}