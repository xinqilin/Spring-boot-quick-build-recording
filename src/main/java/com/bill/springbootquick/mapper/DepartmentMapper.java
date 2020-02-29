package com.bill.springbootquick.mapper;


import com.bill.springbootquick.entities.Employee;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface DepartmentMapper {

    @Select("select * from employee where id=#{id}")
    public Employee getOne(Integer id);

    @Insert("insert into employee values (#{lastName,email,gender,department,birth})")
    public void addEmp(Employee employee);
}
