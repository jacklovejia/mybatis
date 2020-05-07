package com.jack;

import com.jack.service.BaseService;
import com.jack.service.SpringContextUtil;
import com.jack.service.Test1;
import com.jack.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class Test02 {

    @Autowired
    private Test1 test1;
//
//    @Test
//    public void test() throws Exception {
//        List<Jack> jacks = test1.m1();
//        log.info(jacks + "");
//        int size = test1.getSize();
//        log.info("size:" + size);
//    }

    @Test
    public void test01() throws Exception {
        Class<?> clazz = Class.forName("com.jack.service.Test1");
        TestService bean = (TestService) SpringContextUtil.getBean(clazz);
        bean.fin();
    }
}
