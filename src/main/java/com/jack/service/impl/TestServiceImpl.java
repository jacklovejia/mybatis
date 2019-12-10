package com.jack.service.impl;

import com.jack.entity.Are;
import com.jack.service.AreService;
import com.jack.service.JackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestServiceImpl {
    @Autowired
    private AreService areService;

    @Autowired
    private JackService jackService;

    @Transactional
    public void test() {
        jackService.delete();

        if(true){
            throw new RuntimeException();
        }
        areService.insert(new Are("jack"));
    }
}
