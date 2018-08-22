package com.hand.controller;

import com.hand.dto.Department;
import com.hand.dto.Student;
import com.hand.service.DepartmentService;
import com.hand.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @ Author: xin
 * @ Date: 2018/8/22 14:17
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @Autowired
    private StudentService studentService;

    @RequestMapping("/departmentList")
    public String selectAll(Map<String,Object> map) {
        Collection<Department> departments=departmentService.selectAll();
        map.put("departments",departments);
        map.put("student",new Student());
        return "input";
    }

    @RequestMapping("/department/{studentId}")
    public String departmentShow(@PathVariable("studentId") int studentId,Map<String,Object> map) {
        Collection<Department> departments=departmentService.selectAll();
        map.put("departments",departments);
        map.put("student",studentService.selectById(studentId));
        return "input";
    }
}
