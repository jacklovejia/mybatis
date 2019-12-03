package com.jack.rocketmq;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 */
@Slf4j
@Component
@RocketMQMessageListener(topic = "t1", consumerGroup = "a-group")
public class Consumer implements RocketMQListener<MyMessage> {


    @Override
    public void onMessage(MyMessage myMessage) {
        log.info("收到消息:"+myMessage.toString());
    }
}
