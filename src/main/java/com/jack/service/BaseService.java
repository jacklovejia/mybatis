package com.jack.service;

import com.jack.entity.Jack;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class BaseService extends TestService {
    @Autowired
    private JackService jackService;

    @Override
    public List<Jack> m1() {
        Map<String, String> paramap = new HashMap<>();
        paramap.put("name", "1");
        log.info("Base m1 方法");
        return jackService.getList(paramap);
    }

    @Override
    public int getSize() throws Exception {
        log.info("Base getSize方法");
        m2();
        return jackService.getList(null).size();
    }

    protected void m2() {
        log.info("aaaaaaa");
    }
}
