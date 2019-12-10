package com.jack;

import com.jack.entity.Are;
import com.jack.entity.Jack;
import com.jack.service.AreService;
import com.jack.service.JackService;
import com.jack.service.impl.TestServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMybatis {

    @Autowired
    private JackService jackService;

    @Autowired
    private AreService areService;

    @Autowired
    private TestServiceImpl testService;

    @Test
    public void test01() {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("province", "0");
        paramMap.put("id", "1");
        Integer update = jackService.update(paramMap);
        log.info("test01:" + update);
    }

    @Test
    public void test02() {
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("name", "1");
        Integer update = jackService.update(paramMap);
        log.info("test02:" + update);
    }
    @Test
    public void test03() {
//        Map<String, String> paramMap = new HashMap<>();
        jackService.insert(new Jack("111","1","1","1"));
        jackService.insert(new Jack("222","2","2","2"));
        jackService.insert(new Jack("333","3","3","3"));
        jackService.insert(new Jack("444","4","4","4"));
    }

    @Test
    public void test04(){
        /**
         * 事务回滚, 首先先要保证 出现的异常为 运行时异常, 非检查型异常, 空指针啊, by zero 啊, 等, 不能是io异常, 网络超时等这类检查异常
         * 其次, 声明式事务 @Transactional 注解不是加了就好使的, 如果是直接调用那么可以开启事务, 如果是间接调用带有@Transactional注解的方法,
         * 是不开启事务的, Method A() --调用--> @Transactional Method B()  在同一个类中,代理出来的类中, A 方法是一个空的代理, 只调用A方法本身, B 虽然被代理出来了事务的操作,
         * 但是因为A 未加 @Transactional 注解, 所以在调用是, A代理调用A本身, A 本身就会直接调用B , 导致无事务开启
         * Mehtod A() --调用--> @Transactional Method B()  不在统一类中, 就不会出现上面的问题, 事务存在及可以回滚
         *
         * 案例  无事务的: insert() ,
         *       有事务的: 注入的testService.test();
         */
        testService.test();
//        insert();
    }

    @Transactional(rollbackFor = {Exception.class}, propagation = Propagation.REQUIRES_NEW)
    public void insert() {

        jackService.delete();

        if(true){
            throw new RuntimeException();
        }
        areService.insert(new Are("jack"));
    }

}
