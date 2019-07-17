package com.yangguang.serviceImpl;

import com.yangguang.dao.EmployeeWorkMapper;
import com.yangguang.entity.EmployeeWork;
import com.yangguang.service.EmployeeWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeWorkServiceImpl implements EmployeeWorkService {

    @Autowired
    EmployeeWorkMapper workMapper;

    @Override
    public List<EmployeeWork> empWorkByID(String empID) {
        return workMapper.empWorkByID(empID);
    }
}
