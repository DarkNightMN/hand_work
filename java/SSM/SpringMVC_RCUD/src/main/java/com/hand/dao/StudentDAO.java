package com.hand.dao;

import com.hand.dto.Department;
import com.hand.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Author: xin
 * @ Date: 2018/8/21 13:42
 */
@Repository
public class StudentDAO {
    @Autowired
    private DepartmentDAO departmentDAO;

    public static int id=6;
    public static Map<Integer, Student> students=null;
    static {
        students=new HashMap<>();

        students.put(1,new Student(1,"张一",20,new DepartmentDAO().getDepartment(101)));
        students.put(2,new Student(2,"张二",30,new DepartmentDAO().getDepartment(101)));
        students.put(3,new Student(3,"张三",40,new DepartmentDAO().getDepartment(202)));
        students.put(4,new Student(4,"张四",50,new DepartmentDAO().getDepartment(202)));
        students.put(5,new Student(5,"张五",60,new DepartmentDAO().getDepartment(303)));

    }

    public Collection<Student> getAllStudents(){
        return students.values();
    }

    public Student getStudent(Integer id){
        return students.get(id);
    }

    public void deleteStudent(Integer id){
        students.remove(id);
    }

    //新增
    public void saveStudent(Student student){
        if(student.getStudentId()==0){
            student.setStudentId(id++);
        }
        //由于<form:select>只绑定了departmentId，所以需要自己查询departmentName
        student.setDepartment(departmentDAO.getDepartment(student.getDepartment().getDepartmentId()));
        System.out.println(student.getStudentId());
        System.out.println(student);
        students.put(student.getStudentId(),student);
    }


}
