package com.hand.mapper;

import com.hand.dto.Department;
import com.hand.dto.Student;

import java.util.Collection;
import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/8/22 11:50
 */
public interface DepartmentMapper {

//    //查
//    Student selectById(int studentId);

    //list
    Collection<Department> selectAll();
}
