package com.bill.springbootquick.config;

import org.springframework.context.annotation.Configuration;
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
            //亂寫
//        registry.addViewController(map.containsKey(/)).setViewName(map.get());
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
    }



}
