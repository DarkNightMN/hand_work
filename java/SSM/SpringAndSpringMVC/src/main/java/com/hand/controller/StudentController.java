package com.hand.controller;

import com.hand.dto.Student;
import com.hand.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @ Author: xin
 * @ Date: 2018/8/22 13:34
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/studentList")
    public String selectAll(Map<String,Object> map) {
        List<Student> students=studentService.selectAll();
        map.put("student",students);
        return "list";
    }

    @RequestMapping("/delete/{studentId}")
    public String deleteStudent(@PathVariable("studentId") int studentId) {
        studentService.deleteStudent(studentId);
        return "redirect:/studentList";
    }

    @RequestMapping("/addOrUpdate")
    public String addStudent(Student student) {
        if(student.getStudentId()==0){
            studentService.addStudent(student);
        }
        else{
            studentService.updateStudent(student);
        }
        return "redirect:/studentList";
    }
}
