package com.jack.mapper;

import com.jack.entity.Are;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AreMapper {

    List<Are> getList(Map<String, String> paramMap);

    void insert(Are are);

    void delete();
}