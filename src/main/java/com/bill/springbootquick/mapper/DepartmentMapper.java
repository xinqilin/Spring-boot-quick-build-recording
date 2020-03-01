package com.bill.springbootquick.mapper;


import com.bill.springbootquick.entities.Department;
import com.bill.springbootquick.entities.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department")
    public List<Department> getAll();


    @Select("select * from department where id=#{id}")
    public Department getOne(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(id,departmentName) values (null,#{departmentName})")
    public int addDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

    @Delete("Delete from department where id=#{id}")
    public int deleteDept(Integer id);

}
