package com.jack.mapper;

import com.jack.entity.Jack;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface JackMapper {
    List<Jack> getList(Map<String, String> paramMap);

    Integer update(Map<String, String> paramMap);

    void insert(Jack jack);

    void delete();
}