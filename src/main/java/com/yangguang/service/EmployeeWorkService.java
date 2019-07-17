package com.yangguang.service;

import com.yangguang.entity.EmployeeWork;

import java.util.List;

public interface EmployeeWorkService {

    /*
    * 根据员工ID查询工作经历
    * */
    public List<EmployeeWork> empWorkByID(String empID);

}
