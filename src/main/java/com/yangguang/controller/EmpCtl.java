package com.yangguang.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yangguang.entity.Employee;
import com.yangguang.service.EmployeeService;
import com.yangguang.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/employee")
@ResponseBody
public class EmpCtl {

    @Autowired
    private EmployeeService employeeService;


    /*
    * 获取所有员工的信息
    * */
    @RequestMapping(value = "/selectAllEmp",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    public String selectAllEmp(@RequestParam(value = "page",defaultValue = "1") Integer page, @RequestParam(value = "size",defaultValue = "5") Integer size){
        PageHelper.startPage(page,size);
        List<Employee> employees = employeeService.selectAllEmp();
        PageInfo pageInfo = new PageInfo(employees);
        return Return.returnPageHelper(pageInfo);
    }

    /*
    * 根据姓名模糊查询员工信息
    * */
    @RequestMapping(value = "/likeEmpName",produces = "text/html;charset=UTF-8")
    public String likeEmpName(String likeEmpName){
        List<Employee> list = employeeService.likeEmpName(likeEmpName);
        return Return.returnListInfo(list);
    }


    /*
    * 根据员工ID获得员工信息
    * */

    @RequestMapping(value = "/empById",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    public String empById(String empId){

        Employee employee = employeeService.empById(empId);
        return Return.returnEntityInfo(employee);
    }

    /*
    * 添加员工
    * */
    @RequestMapping(value = "/addEmp",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    public String addEmployee(Employee employee){
        int i = employeeService.addEmp(employee);
        return Return.returnIntInfo(i);
    }

    /*
    * 修改员工信息
    * */
    @RequestMapping(value = "/updataEmp",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    public String updataEmployee(Employee employee){
        int i = employeeService.updataEmp(employee);
        return Return.returnIntInfo(i);
    }

}
