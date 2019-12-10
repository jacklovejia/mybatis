package com.jack.controller;

import com.jack.entity.Jack;
import com.jack.service.JackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class Test {
    @Autowired
    private JackService jackService;

    @GetMapping("/test01")
    public String test01() {
        System.out.println("123");
        Map<String, String> dataMap = new HashMap<>();
        return jackService.getList(dataMap).toString();
    }

    @GetMapping("/test02")
    public String test02() {
        System.out.println("123");
        Map<String, String> dataMap = new HashMap<>();
        return jackService.getList(dataMap).toString();
    }

    @GetMapping("/test03")
    public void test03(){
        insert();
    }


    @Transactional
    public void insert() {
        a();
    }

    public void a(){
        jackService.delete();
        if(true){
            throw new RuntimeException();
        }
        jackService.insert(new Jack("111","1","1","1"));
        jackService.insert(new Jack("222","2","2","2"));
        jackService.insert(new Jack("333","3","3","3"));
        jackService.insert(new Jack("444","4","4","4"));
    }
}
