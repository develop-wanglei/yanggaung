package com.yangguang.controller;

import com.alibaba.fastjson.JSONObject;
import com.yangguang.entity.Title;
import com.yangguang.service.TitleService;
import com.yangguang.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping(value = "/title")
@ResponseBody
public class TitleCtl{


    @Autowired
    private TitleService titleService;


    @RequestMapping(value = "/slide",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    public String selectAllTitle(){
        List<Title> titles = titleService.selectAllTitle("轮播图");
        return Return.returnListInfo(titles);
    }
}
