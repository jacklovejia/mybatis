package com.jack.rocketmq;


import lombok.Data;

import java.util.Date;

/**
 * 自定义消息
 */
@Data
public class MyMessage {
    private Integer id;
    private String name;
    private String status;
    private Date createTime;

    public MyMessage(Integer id, String name, String status, Date createTime) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "MyMessage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
