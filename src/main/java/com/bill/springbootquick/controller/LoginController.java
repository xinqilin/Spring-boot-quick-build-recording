package com.bill.springbootquick.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {


    //    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, String> map, HttpSession session) {

        if (!StringUtils.isEmpty(username) && password.equals("zzz")) {
            session.setAttribute("userInfo", username);
            return "redirect:/main.html";
        } else {
            map.put("msg", "密碼錯誤!!!");
            return "login";
        }
    }
}
