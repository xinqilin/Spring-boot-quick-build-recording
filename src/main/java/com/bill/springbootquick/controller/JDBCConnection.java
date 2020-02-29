package com.bill.springbootquick.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


@Controller
public class JDBCConnection {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @ResponseBody
    @GetMapping("/jdbc/id={depid}")
    public Map<String, Object> jdbc(@PathVariable("depid") Integer depid, Map<String, Object> map, HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

        List<Map<String, Object>> list = new LinkedList<>();
        try {
            list = jdbcTemplate.queryForList("select * from department where id=" + depid);
            if (list.size() != 0) {
                return list.get(0);
            }

        } catch (Exception e) {
            System.err.println("Exception:  " + e.getMessage());
        }
        map.put("error", "沒有符合資料");
        req.getRequestDispatcher("/src/main/resources/templates/error/404.html").forward(req, res);
        return null;
    }


}
