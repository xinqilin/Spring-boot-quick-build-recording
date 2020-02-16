package com.bill.springbootquick.config;

import com.bill.springbootquick.component.LoginHandlerIntercepter;
import com.bill.springbootquick.component.SwitchLocale;
import org.aopalliance.intercept.Interceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MyMVCConfig implements WebMvcConfigurer {


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        Map<String,String> map=new HashMap<String,String>();
//        map.put("/","login");
//        map.put("/index.html","login");
//        map.put("/login.html","login");
//        registry.addViewController(map.containsKey(/)).setViewName(map.get());
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
//        registry.addViewController("/login.html").setViewName("login");
        registry.addViewController("main.html").setViewName("dashboard");
    }

//    @Autowired
//    private LoginHandlerIntercepter loginHandlerIntercepter;

    
    public void addInterceptor(InterceptorRegistry registry){
        System.out.println("AOP生效");

        registry.addInterceptor(new LoginHandlerIntercepter()).addPathPatterns("/**")
                .excludePathPatterns("/","/index.html","/login");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return new SwitchLocale();
    }

//    @Bean
//    public HandlerInterceptor handlerInterceptor(){
//        return new LoginHandlerIntercepter();
//    }


}
