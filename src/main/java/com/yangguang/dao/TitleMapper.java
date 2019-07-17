package com.yangguang.dao;

import com.yangguang.entity.Title;
import com.yangguang.entity.TitleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TitleMapper {
    long countByExample(TitleExample example);

    int deleteByExample(TitleExample example);

    int insert(Title record);

    int insertSelective(Title record);

    List<Title> selectByExample(TitleExample example);

    int updateByExampleSelective(@Param("record") Title record, @Param("example") TitleExample example);

    int updateByExample(@Param("record") Title record, @Param("example") TitleExample example);

    List<Title> selectByLocation(String location);
}