package com.jack.mapper;

import com.jack.entity.Jack;
import com.jack.entity.JackExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JackMapper {
    int countByExample(JackExample example);

    int deleteByExample(JackExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jack record);

    int insertSelective(Jack record);

    List<Jack> selectByExample(JackExample example);

    Jack selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jack record, @Param("example") JackExample example);

    int updateByExample(@Param("record") Jack record, @Param("example") JackExample example);

    int updateByPrimaryKeySelective(Jack record);

    int updateByPrimaryKey(Jack record);
}