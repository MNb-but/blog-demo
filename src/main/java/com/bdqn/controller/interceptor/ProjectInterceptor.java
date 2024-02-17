package com.bdqn.controller.interceptor;

import com.bdqn.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Component
public class ProjectInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        System.out.println("路径" + uri);
        //判断当前请求地址是否登录地址
        if (uri.contains("login") || uri.contains("register") || uri.contains("index") || uri.contains("articles") || uri.contains("user")) {
            //登录请求，直接放行
            return true;
        } else {
            System.out.println(request.getSession().getAttribute("userName"));
            //判断用户是否登录
            if (request.getSession().getAttribute("userName") != null) {
                //说明已经登录，放行
                return true;
            } else {
                //没有登录，跳转到登录界面
                response.sendRedirect("login.html");
            }
        }
        return false; // false终止原始操作
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}
