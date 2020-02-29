package com.bill.springbootquick.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
public class JDBCConnection {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @ResponseBody
    @GetMapping("/jdbc")
    public Map<String,Object> jdbc(){
        try {
            List<Map<String,Object>> list=jdbcTemplate.queryForList("select * from department");
            return list.get(0);
        }catch (Exception e){
            System.err.println("抓到的List是空的and  "+e.getMessage());
        }
        return null;
    }



}
