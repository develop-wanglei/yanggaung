package com.yangguang.service;

import com.yangguang.entity.EmployeeFamily;

import java.util.List;

public interface EmployeeFamilyService {

    /*
    * 根据员工ID查询员工家庭情况
    * */
    List<EmployeeFamily> empFamilyById(String empID);
}
