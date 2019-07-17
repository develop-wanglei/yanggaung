package com.yangguang.serviceImpl;

import com.yangguang.dao.EmployeeFamilyMapper;
import com.yangguang.entity.EmployeeFamily;
import com.yangguang.service.EmployeeFamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeFamilyServiceImpl implements EmployeeFamilyService {

    @Autowired
    private EmployeeFamilyMapper employeeFamilyMapper;

    @Override
    public List<EmployeeFamily> empFamilyById(String empID) {
        return employeeFamilyMapper.empFamilyById(empID);
    }
}
