package com.yangguang.controller;

        import com.alibaba.fastjson.JSONObject;
        import com.yangguang.entity.User;
        import com.yangguang.service.UserService;
        import com.yangguang.util.Return;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserCtl {

    @Autowired
    private UserService userService;

    /*
     * 添加用户
     * */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String addUser(User user){
        int i = userService.addUser(user);
        return Return.returnIntInfo(i);
    }

    /*
     * 验证用户名和密码
     * */
    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String login(String username,String userpassword){
        User user = userService.selectUser(username, userpassword);
        JSONObject json = new JSONObject();
        json.put("user",user.toString());
        return json.toJSONString();
    }

    /*
     * 用户修改密码
     * */
    @RequestMapping(value = "/updataPwd",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String updataUserPwd(String username,String pwd){
        int i = userService.upUserPwd(username, pwd);
        return Return.returnIntInfo(i);
    }

}
