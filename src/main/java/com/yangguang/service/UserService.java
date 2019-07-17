package com.yangguang.service;

import com.yangguang.entity.User;

import java.util.List;

public interface UserService {

    /*
    * 添加管理的用户信息
    * */
    public int addUser(User user);

    /*
    * 修改用户的密码
    * */
    public int upUserPwd(String userName,String userPassword);

    /*
    * 登录验证用户名和密码
    * */
    public User selectUser(String userName, String userPasseord);
}
