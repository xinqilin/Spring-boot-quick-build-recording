package com.bill.springbootquick.controller;


import com.bill.springbootquick.entities.Department;
import com.bill.springbootquick.entities.Employee;
import com.bill.springbootquick.mapper.DepartmentMapper;
import com.bill.springbootquick.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ResponseBody
@Controller
public class DepartmentController {

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/select{id}")
    public Department getDepartment(@PathVariable("id") Integer id) {
        return departmentMapper.getOne(id);
    }

    @GetMapping("/add")
    public Department addDepartment(Department dept) {
        departmentMapper.addDept(dept);
        return dept;
    }

    @GetMapping("/update")
    public Department updateDepartment(Department dept) {
        departmentMapper.updateDept(dept);
        return dept;
    }

    @GetMapping("/delete")
    public String deleteDepartment(Integer id) {
        departmentMapper.deleteDept(id);
        return "id"+id+"部門已刪除";
    }

    @GetMapping("/all")
    public List getAllDept(){
        return departmentMapper.getAll();
    }


//    @GetMapping("/selectEmp{id}")
//    public Employee getEmp(@PathVariable("id") Integer id) {
//        return employeeMapper.getOne(id);
//    }


}
