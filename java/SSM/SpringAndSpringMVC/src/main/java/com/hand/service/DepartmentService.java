package com.hand.service;

import com.hand.dto.Department;
import com.hand.dto.Student;
import com.hand.mapper.DepartmentMapper;
import com.hand.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * @ Author: xin
 * @ Date: 2018/8/22 11:50
 */
@Service
public class DepartmentService implements DepartmentMapper {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Collection<Department> selectAll() {
        return departmentMapper.selectAll();
    }
}
