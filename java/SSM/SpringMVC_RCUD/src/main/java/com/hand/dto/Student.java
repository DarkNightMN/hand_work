package com.hand.dto;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;

/**
 * @ Author: xin
 * @ Date: 2018/8/17 10:57
 */

public class Student {
    private int studentId;

    @NotEmpty
    private String studentName;

    @Range(max = 200,min=0)
    private int studentAge;

    private Department department;

    public Student() {
    }

    public Student(int studentId, String studentName, int studentAge, Department department) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", department=" + department +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

}
