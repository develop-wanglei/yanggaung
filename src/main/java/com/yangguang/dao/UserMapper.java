package com.yangguang.dao;

import com.yangguang.entity.User;
import com.yangguang.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface UserMapper {

    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /*
    * 根据用户名修改密码
    * */
    int updatePwdByUsername(String userName,String userPassword);

    /*
    * 验证用户名和密码
    * */
    User selectUserAndPwd(String userName,String userPassword);
}