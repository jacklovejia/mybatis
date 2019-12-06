package com.jack.entity;

import lombok.Data;

@Data
public class Jack {

    private Long id;
    private String name;
    private String status;
    private String province;
    private String company;

    public Jack(String name, String status, String province, String company) {
        this.name = name;
        this.status = status;
        this.province = province;
        this.company = company;
    }
}