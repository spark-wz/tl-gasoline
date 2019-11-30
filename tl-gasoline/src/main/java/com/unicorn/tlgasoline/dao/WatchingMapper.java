package com.unicorn.tlgasoline.dao;

import com.unicorn.tlgasoline.entity.Watching;
import com.unicorn.tlgasoline.entity.WatchingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WatchingMapper {
    int countByExample(WatchingExample example);

    int deleteByExample(WatchingExample example);

    int insert(Watching record);

    int insertSelective(Watching record);

    List<Watching> selectByExample(WatchingExample example);

    int updateByExampleSelective(@Param("record") Watching record, @Param("example") WatchingExample example);

    int updateByExample(@Param("record") Watching record, @Param("example") WatchingExample example);
}