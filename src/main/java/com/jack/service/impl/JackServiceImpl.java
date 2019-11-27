package com.jack.service.impl;

import com.jack.entity.Jack;
import com.jack.mapper.JackMapper;
import com.jack.service.JackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("jackService")
public class JackServiceImpl implements JackService {
    @Autowired
    private JackMapper jackMapper;

    @Override
    public List<Jack> getList(Map<String, String> paramMap) {
        return jackMapper.getList(paramMap);
    }
}
