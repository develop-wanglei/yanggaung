package com.yangguang.controller;

import com.alibaba.fastjson.JSONObject;
import com.yangguang.entity.EmployeeFamily;
import com.yangguang.service.EmployeeFamilyService;
import com.yangguang.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/empFamily")
@ResponseBody
public class EmpFamilyCtl {

    @Autowired
    private EmployeeFamilyService employeeFamilyService;

    @RequestMapping(value = "/empFamilyByEmpId",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    public String empFamilyByEmpId(String empId){
        List<EmployeeFamily> family = employeeFamilyService.empFamilyById(empId);
        return Return.returnListInfo(family);
    }

}
