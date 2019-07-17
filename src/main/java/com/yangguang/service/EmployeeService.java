package com.yangguang.service;

import com.yangguang.entity.Employee;

import java.util.List;

public interface EmployeeService {

    /*
    * 查询所有员工信息
    * */
    public List<Employee> selectAllEmp();


    /*
    *模糊查询员工姓名
    * */
    public List<Employee> likeEmpName(String likeEmpName);


    /*
    * 根据员工ID查询员工信息
    * */
    public Employee empById(String empId);

    /*
    * 添加员工的信息
    * */
    public int addEmp(Employee employee);

    /*
    * 修改员工信息
    * */
    public int updataEmp(Employee employee);
}
