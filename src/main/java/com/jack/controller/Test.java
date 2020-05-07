package com.jack.controller;

import com.jack.entity.Jack;
import com.jack.service.JackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
    public void test03() {
        insert();
    }

    /**
     * 测试 @RequestParam
     *
     * @param data
     * @param url
     * @return
     */
    @PostMapping("/test04")
    public String test04(@RequestParam String data, @RequestParam(required = false) String url) {
        log.info("data:" + data + ",url:" + url);
        return "ok";
    }

    @PostMapping("/test05")
    public Map<String, Object> test05(@RequestBody String data) {
        log.info("data:" + data);
        Map<String, Object> map = new HashMap<>();
        map.put("status", "ok");
        return map;
    }


    @Transactional
    public void insert() {
        jackService.delete();
        int a = 10 / 0;
        jackService.insert(new Jack("111", "1", "1", "1"));
        jackService.insert(new Jack("222", "2", "2", "2"));
        jackService.insert(new Jack("333", "3", "3", "3"));
        jackService.insert(new Jack("444", "4", "4", "4"));
    }
}
