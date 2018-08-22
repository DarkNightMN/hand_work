package com.hand.service;

import com.hand.dto.Student;
import com.hand.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/8/22 11:50
 */
@Service
public class StudentService implements StudentMapper {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectById(int studentId) {
        return studentMapper.selectById(studentId);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public void deleteStudent(int studentId) {
        studentMapper.deleteStudent(studentId);
    }

    @Override
    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    @Override
    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }
}
