package com.hand.mapper;

import com.hand.dto.Student;

import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/8/22 11:50
 */
public interface StudentMapper {

    //查
    Student selectById(int studentId);

    //list
    List<Student> selectAll();

    //删
    void deleteStudent(int studentId);

    //改
    void updateStudent(Student student);

    //增
    void addStudent(Student student);

}
