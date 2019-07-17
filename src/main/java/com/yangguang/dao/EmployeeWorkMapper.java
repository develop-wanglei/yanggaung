package com.yangguang.dao;

import com.yangguang.entity.EmployeeWork;
import com.yangguang.entity.EmployeeWorkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeWorkMapper {
    long countByExample(EmployeeWorkExample example);

    int deleteByExample(EmployeeWorkExample example);

    int deleteByPrimaryKey(Integer empWorkId);

    int insert(EmployeeWork record);

    int insertSelective(EmployeeWork record);

    List<EmployeeWork> selectByExample(EmployeeWorkExample example);

    EmployeeWork selectByPrimaryKey(Integer empWorkId);

    int updateByExampleSelective(@Param("record") EmployeeWork record, @Param("example") EmployeeWorkExample example);

    int updateByExample(@Param("record") EmployeeWork record, @Param("example") EmployeeWorkExample example);

    int updateByPrimaryKeySelective(EmployeeWork record);

    int updateByPrimaryKey(EmployeeWork record);

    /*
    * 根据员工ID查询工作经历
    * */
    List<EmployeeWork> empWorkByID(String empId);
}