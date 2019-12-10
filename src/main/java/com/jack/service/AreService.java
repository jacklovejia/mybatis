package com.jack.service;

import com.jack.entity.Are;

import java.util.List;
import java.util.Map;

public interface AreService {
    List<Are> getList(Map<String, String> paramMap);

    void insert(Are are);

    void delete();
}
