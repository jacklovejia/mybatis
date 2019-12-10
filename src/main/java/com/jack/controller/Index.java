package com.jack.controller;

import com.jack.entity.Jack;
import com.jack.service.JackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
public class Index {

    @Autowired
    private JackService jackService;

    @RequestMapping("/index")
    public String index(Model model) {
        model.addAttribute("info", "user/list");
        return "index";
    }
    @RequestMapping("/index1")
    public String index1(Model model) {
        List<Jack> list = jackService.getList(null);
        model.addAttribute("list", "list");
        return "index1";
    }
}
