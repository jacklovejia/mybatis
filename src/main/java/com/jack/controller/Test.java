package com.jack.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jack.entity.Jack;
import com.jack.entity.JackExample;
import com.jack.mapper.JackMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test {

    @Autowired
    private JackMapper jackMapper;

    @RequestMapping("/test")
    public String test() {
        return "";
    }

    @RequestMapping("/testPage")
    public JSONObject tsetPage() {
        JSONObject jsonObject = new JSONObject();
        JackExample example = new JackExample();
        PageHelper.startPage(1, 4);
        List<Jack> list = jackMapper.selectByExample(example);
        PageInfo<Jack> p = new PageInfo<>(list);
        jsonObject.put("page", p);
        jsonObject.put("data", list);
        return jsonObject;
    }
}
