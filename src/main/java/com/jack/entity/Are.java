package com.jack.entity;

import lombok.Data;

@Data
public class Are {
    private Integer id;
    private String name;

    public Are(String name) {
        this.name = name;
    }
}
