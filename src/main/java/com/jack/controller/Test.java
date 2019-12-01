package com.jack.controller;

import com.jack.service.JackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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

}
