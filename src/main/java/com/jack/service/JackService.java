package com.jack.service;

import com.jack.entity.Jack;

import java.util.List;
import java.util.Map;

public interface JackService {
    List<Jack> getList(Map<String, String> paramMap);

    Integer update(Map<String, String> paramMap);
}
