package com.yangguang.dao;

import com.yangguang.entity.EmployeeFamily;
import com.yangguang.entity.EmployeeFamilyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeFamilyMapper {
    long countByExample(EmployeeFamilyExample example);

    int deleteByExample(EmployeeFamilyExample example);

    int deleteByPrimaryKey(Integer empFamilyId);

    int insert(EmployeeFamily record);

    int insertSelective(EmployeeFamily record);

    List<EmployeeFamily> selectByExample(EmployeeFamilyExample example);

    EmployeeFamily selectByPrimaryKey(Integer empFamilyId);

    int updateByExampleSelective(@Param("record") EmployeeFamily record, @Param("example") EmployeeFamilyExample example);

    int updateByExample(@Param("record") EmployeeFamily record, @Param("example") EmployeeFamilyExample example);

    int updateByPrimaryKeySelective(EmployeeFamily record);

    int updateByPrimaryKey(EmployeeFamily record);

    List<EmployeeFamily> empFamilyById(String empID);
}