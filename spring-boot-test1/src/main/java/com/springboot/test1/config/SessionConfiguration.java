package com.springboot.test1.config;

import com.springboot.test1.interceptor.LoggerInterceptor;
import com.springboot.test1.interceptor.SessionInterceptor;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*
* 添加配置类  增加一个拦截器
* */
@Configuration
public class SessionConfiguration implements WebMvcConfigurer {

    /*
    * 增加拦截器，并指明拦截规则
    * */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new LoggerInterceptor()).addPathPatterns("/**");
    }
}
