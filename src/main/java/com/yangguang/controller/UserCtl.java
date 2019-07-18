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
        import org.springframework.web.servlet.ModelAndView;

        import javax.servlet.http.HttpSession;

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
    public String login(String username, String password, HttpSession session){
        User user = userService.selectUser(username, password);
        if (user!=null){
            session.setAttribute("user",user);
        }
        return Return.returnEntityInfo(user);
    }

    /*
     * 用户修改密码
     * */
    @RequestMapping(value = "/updataPwd",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String updataUserPwd(String pwd,HttpSession session){
        User user = (User) session.getAttribute("user");
        int i = userService.upUserPwd(user.getUserName(), pwd);
        return Return.returnIntInfo(i);
    }

    @RequestMapping("/upPwd")
    public ModelAndView upPwd(){
        return new ModelAndView("upPwd");
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("indexAdmin");
        return view;
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "forward:/login.jsp";
    }
}
