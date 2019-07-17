package com.yangguang.serviceImpl;

import com.yangguang.dao.UserMapper;
import com.yangguang.entity.User;
import com.yangguang.entity.UserExample;
import com.yangguang.service.UserService;
import com.yangguang.util.ToMD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        /*
        * MD5加密密码
        * */
        String pwd=ToMD5.toMd5(user.getUserPassword());
        user.setUserPassword(pwd);
        System.out.println(userMapper);
        return userMapper.insertSelective(user);
    }

    @Override
    public int upUserPwd(String userName, String userPassword) {
        String pwd = ToMD5.toMd5(userPassword);
        int i = userMapper.updatePwdByUsername(userName,pwd);
        return i;
    }

    @Override
    public User selectUser(String userName, String userPasseord) {
        String md5 = ToMD5.toMd5(userPasseord);
        return userMapper.selectUserAndPwd(userName, md5);
    }
}
