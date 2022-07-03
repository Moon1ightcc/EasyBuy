package com.easybuy.interceptorstudy;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("user");
        if (user == null){//说明没有登录，跳转登录页面而去
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return false;//不再执行控制器处理请求了
        }else

        {//用户补位空，说明已经登录
            return true;//继续执行控制器处理器请求
        }
    }
}
