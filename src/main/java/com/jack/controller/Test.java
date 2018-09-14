package com.jack.controller;

import com.jack.entity.CmsApiExample;
import com.jack.entity.CmsApiWithBLOBs;
import com.jack.mapper.CmsApiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;

@RestController
public class Test {

    @Autowired
    private CmsApiMapper cmsApiMapper;

    @RequestMapping("/test")
    public String test(){
        CmsApiWithBLOBs cmsApiWithBLOBs = cmsApiMapper.selectByPrimaryKey(10l);
        return cmsApiWithBLOBs.toString();
    }
    @RequestMapping("/testPage")
    public String tsetPage(){
        CmsApiExample example = new CmsApiExample();
//        PageHelper.startPage(1, 4);
        cmsApiMapper.selectByExample(example);
        return null;
    }
}
