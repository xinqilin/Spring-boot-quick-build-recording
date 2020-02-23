package com.bill.springbootquick.controller;

import com.bill.springbootquick.exception.UserNotFindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class ExceptionHandler {

//    @ResponseBody
//    @org.springframework.web.bind.annotation.ExceptionHandler(UserNotFindException.class)
//    public Map<String, Object> HandlerException(UserNotFindException e){
//        Map<String,Object> map=new HashMap<String, Object>();
//        map.put("code","UserNotFind");
//        map.put("Msg",e.getMessage());
//        map.put("StackTrace", e.getStackTrace());
//        map.put("LocalMsg",e.getLocalizedMessage());
//
//        return map;
//    }


    @org.springframework.web.bind.annotation.ExceptionHandler(UserNotFindException.class)
    public String HandlerException(UserNotFindException e, HttpServletRequest req){
        req.setAttribute("javax.servlet.error.status_code",400);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("code","UserNotFind");
        map.put("Msg",e.getMessage());
//        map.put("StackTrace", e.getStackTrace());
        map.put("LocalMsg",e.getLocalizedMessage());

        req.setAttribute("Extend",map);
        return "forward:/error";
    }
}
