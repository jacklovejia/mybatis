package com.jack.service;

import com.jack.entity.Jack;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Slf4j
public abstract class TestService {
    private JackService jackService;

    protected abstract List<Jack> m1();

    protected abstract int getSize() throws Exception;

    public void fin() throws Exception{
        log.info("fin方法 开始");
        m1();
        getSize();
        log.info("fin方法结束");
    }
}
