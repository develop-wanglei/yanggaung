package com.yangguang.test;

import com.yangguang.entity.User;
import com.yangguang.service.UserService;
import com.yangguang.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class test {



    @Test
    public void test1() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
       /* List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("src/main/testResource/generator-config.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);*/
    }

    @Autowired
    UserService userService;

    @Test
    public void addUser(){

        User user = new User();
        user.setUserName("15666335255");
        user.setUserPassword("123456");
        user.setValidity(1);
        int i = userService.addUser(user);
        System.out.println("修改行数："+i);

    }

}
