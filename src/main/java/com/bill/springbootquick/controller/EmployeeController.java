package com.bill.springbootquick.controller;


import com.bill.springbootquick.dao.DepartmentDao;
import com.bill.springbootquick.dao.EmployeeDao;
import com.bill.springbootquick.entities.Department;
import com.bill.springbootquick.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String lists(Model model){
        Collection<Employee> employees=employeeDao.getAll();
        model.addAttribute("emps",employees);


        return "emp/list";
    }


    @GetMapping("/toAddEmpPage")
    public String toAddEmpPage(Model model){
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("departments",departments);
        return "emp/addEmpPage";

    }

}
