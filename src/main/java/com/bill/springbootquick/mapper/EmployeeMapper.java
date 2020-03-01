package com.bill.springbootquick.mapper;


import com.bill.springbootquick.entities.Employee;
import org.apache.ibatis.annotations.*;
import org.mybatis.spring.annotation.MapperScan;

@Mapper
public interface EmployeeMapper {

    @Select("select * from employee where id=#{id}")
    public Employee getOne(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into employee(lastname,email,gender,d_id) values (#{lastName},#{email},#{gender},#{departmentId})")
    public void addEmp(Employee employee);

    @Update("update employee set lastname=#{lastName},email=#{email},gender=#{gender},d_id=#{departmentId} where id=#{id}")
    public void updateEmp(Employee employee);

    @Delete("Delete from employee where id=#{id}")
    public void deleteEmp(Integer id);
}
