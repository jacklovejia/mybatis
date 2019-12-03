package com.jack.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Producer {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    public String send(String top, MyMessage myMessage){
        rocketMQTemplate.convertAndSend(top, myMessage);
        return "111";
    }
}
