package com.jack;

import com.jack.entity.Jack;
import com.jack.plugins.PageUtil;
import com.jack.service.JackService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMybatis {

    @Autowired
    private JackService jackService;

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
    public  void  test04(){
        PageUtil.setPagingParam(1, 2);
        List<Jack> list = jackService.getList(null);
        log.info(list.size()+"");
        log.info(list+"");
        PageUtil.setPagingParam(1, 10);
        List<Jack> list2 = jackService.getList(null);
        log.info(list2.size()+"");
        log.info(list2+"");
    }

}
