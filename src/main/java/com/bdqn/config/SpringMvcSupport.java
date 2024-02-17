package com.bdqn.config;


import com.bdqn.controller.interceptor.ProjectInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport{
    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/user","/user/*");
        registry.addInterceptor(projectInterceptor).addPathPatterns("/articles","/articles/*");
    }


    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/index.html").addResourceLocations("/index.html");
//        registry.addResourceHandler("/login.html").addResourceLocations("/login.html");
//        registry.addResourceHandler("/register.html").addResourceLocations("/register.html");
        registry.addResourceHandler("/**").addResourceLocations("/");
        registry.addResourceHandler("/image/**").addResourceLocations("/image/");
        registry.addResourceHandler("/css/**").addResourceLocations("/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("/js/");
        registry.addResourceHandler("/element-ui/**").addResourceLocations("/element-ui/");
        registry.addResourceHandler("/icons-main/**").addResourceLocations("/icons-main/");
    }
}
