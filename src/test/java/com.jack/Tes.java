package com.jack;

import com.alibaba.fastjson.JSONObject;

public class Tes {

    private String id;
    private String name;

    public Tes(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String str = "{\"a\":\"2\"}";
        JSONObject dataJson = JSONObject.parseObject(str);
        System.out.println(dataJson);
        String param = dataJson.getString("param");

        String a ="";
        a.getBytes();





    }

}
