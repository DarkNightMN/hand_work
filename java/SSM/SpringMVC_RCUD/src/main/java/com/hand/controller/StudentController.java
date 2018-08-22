package com.hand.controller;

import com.hand.dao.DepartmentDAO;
import com.hand.dao.StudentDAO;
import com.hand.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @ Author: xin
 * @ Date: 2018/8/21 13:36
 */
@Controller
public class StudentController {

    @Autowired
    private StudentDAO studentDAO;
    @Autowired
    private DepartmentDAO departmentDAO;

    //显示列表
    @RequestMapping(value = "/student",method =RequestMethod.GET)
    public String getList(Map<String,Object> students){
        students.put("list",studentDAO.getAllStudents());
        return "list";
    }

    //显示下拉框列表,新增页面student为空
    @RequestMapping("/department")
    public String getDepList(Map<String,Object> map){
        map.put("departments",departmentDAO.getAllDepartments());
        map.put("student",new Student());
        return "input";
    }
    //显示下拉框列表,编辑页面显示student
    @RequestMapping("/department2/{id}")
    public String getDepList2(Map<String,Object> map, @PathVariable(value = "id") int studentId ){
        map.put("departments",departmentDAO.getAllDepartments());
        map.put("student",studentDAO.getStudent(studentId));
        return "input";
    }

    //新增
    @RequestMapping(value = "/student",method =RequestMethod.POST )
    public String addStudent(@Valid Student student, BindingResult result,Map<String,Object> map){
        if(result.getErrorCount()>0){
            System.out.println("error");
            for(FieldError error:result.getFieldErrors()){
                System.out.println(error.getField()+":"+error.getDefaultMessage());
            }
            //输入错误，留在当前页面
            map.put("departments",departmentDAO.getAllDepartments());
            return "input";
        }else{
            studentDAO.saveStudent(student);
        }
        return "redirect:/student";
    }

    //修改
    @RequestMapping(value = "/student",method =RequestMethod.PUT )
    public String updateStudent(Student student){
        studentDAO.saveStudent(student);
        return "redirect:/student";
    }

    //删除
    @RequestMapping(value = "/student/{id}",method =RequestMethod.DELETE )
    public String deleteStudent(@PathVariable("id") int studentId){
        studentDAO.deleteStudent(studentId);
        return "redirect:/student";
    }

    @ModelAttribute
    public void getStudent(@RequestParam(value = "studentId",required = false) Integer id, Map<String,Object> map){
        if(id!=null){
            map.put("student",studentDAO.getStudent(id));
        }
    }

    @RequestMapping(value = "/testJson",method = RequestMethod.POST)
    @ResponseBody
    public Collection<Student> testJson(){
        return studentDAO.getAllStudents();
    }
}
