package com.jack.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class Test1 extends BaseService {
//    @Override
//    public int getSize() throws Exception {
//        log.info("Test1 getSize方法");
//        return 1314;
//    }

    @Override
    protected void m2() {
        log.info("Test1. m2");
    }
}
