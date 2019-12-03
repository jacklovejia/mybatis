package com.jack.controller;

import com.jack.rocketmq.MyMessage;
import com.jack.rocketmq.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/mq")
public class TestMQ {

    @Autowired
    private Producer producer;


    @GetMapping("/t1")
    public String sendMQ(){
        String top = "t1";
        return producer.send(top, new MyMessage(1,"1","1",new Date()));
    }
}
