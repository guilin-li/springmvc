package com.lgl.interceptor;

import com.lgl.domain.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1:判断一下路径，如果访问的是order address..判断是否登录 未登录强制到登入页面
public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("LoginInterceptor preHandle------------------------");
        User user = (User) request.getSession().getAttribute("user");
        if(user == null){
            String address = request.getRequestURI();
            System.out.println("address = "+address);
            if(address.contains("order")||address.contains("address")){
                String contextPath=request.getContextPath();
                response.sendRedirect(contextPath+"/login.jsp");
                //强制到登录页面
                return false;
            }
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("LoginInterceptor postHandle------------------------");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("LoginInterceptor afterCompletion------------------------");
    }
}
