package com.springboot.test1.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println(request.getRequestURL());
        if(request.getRequestURI().equals("/index/login") || request.getRequestURI().equals("/index/login_view")){
            return true;
        }
        Object obj = request.getSession().getAttribute("User");
        if(obj == null){
            response.sendRedirect("/index/login_view");
            return false;
        }
        return true;
    }
}
