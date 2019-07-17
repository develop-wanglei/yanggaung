package com.yangguang.controller;

import com.alibaba.fastjson.JSONObject;
import com.yangguang.entity.EmployeeWork;
import com.yangguang.service.EmployeeWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/empWork")
@ResponseBody
public class EmpWorkCtl {

    @Autowired
    private EmployeeWorkService employeeWorkService;

    @RequestMapping(value = "/empWorkByEmpId",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    public String empWorkID(String empID){
        List<EmployeeWork> list = employeeWorkService.empWorkByID(empID);
        JSONObject json = new JSONObject();
        if(list.size()!=0){
            json.put("code",1);
            json.put("data",list);
            return json.toString();
        }else {
            json.put("code",0);
            json.put("info","未查询到数据！");
            return json.toString();
        }
    }
}
