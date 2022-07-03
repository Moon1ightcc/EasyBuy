package com.easybuy.controller.customer;

import com.easybuy.entity.TUsers;
import com.easybuy.service.impl.TuserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private TuserServiceImpl tuserService;

    @RequestMapping("/dologin")
    public String doLogin(String userName, String passWord, HttpSession session ){
        System.out.println(userName+","+passWord);
        TUsers user = tuserService.doLogin(userName, passWord);
        if(user!=null){ // 登录成功
            session.setAttribute("user",user); //将user存入session
            return "index";
        }else{
            return "login"; // 还原登录页面
        }
    }

    @RequestMapping("/doReigister")
    public String doLogin(TUsers users){
//        System.out.println(users);
        tuserService.registerUser(users);
        return "reg_result"; //注册后返回登录页面
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

}
