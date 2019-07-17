package com.yangguang.serviceImpl;

import com.yangguang.dao.EmployeeMapper;
import com.yangguang.entity.Employee;
import com.yangguang.service.EmployeeService;
import com.yangguang.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> selectAllEmp() {
        return employeeMapper.selectByExample(null);
    }

    @Override
    public List<Employee> likeEmpName(String likeEmpName) {
        likeEmpName="%"+likeEmpName+"%";
        List<Employee> list = employeeMapper.likeEmpName(likeEmpName);
        return list;
    }

    @Override
    public Employee empById(String empId) {
        return employeeMapper.selectByPrimaryKey(empId);
    }

    @Override
    public int addEmp(Employee employee) {
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");
        employee.setEmpId(uuid);
        return employeeMapper.insertSelective(employee);
    }

    @Override
    public int updataEmp(Employee employee) {
        return employeeMapper.updateByPrimaryKeySelective(employee);
    }
}
