package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import test.daoImpl.StudentService;
import test.pojo.Student;

/**
 * @ Author: xin
 * @ Date: 2018/8/18 17:06
 */
public class StudentController {

    @Autowired
    private StudentService studentService;

    public Student selectById(int studentId) {
        return studentService.selectById(studentId);
    }
}
