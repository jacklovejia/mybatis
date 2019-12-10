package com.jack.service.impl;

import com.jack.entity.Are;
import com.jack.mapper.AreMapper;
import com.jack.service.AreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AreServiceImpl implements AreService {
    @Autowired
    private AreMapper areMapper;

    @Override
    public List<Are> getList(Map<String, String> paramMap) {
        return areMapper.getList(paramMap);
    }


    @Override
    public void insert(Are are) {
        areMapper.insert(are);
    }

    @Override
    public void delete() {
        areMapper.delete();
    }
}
