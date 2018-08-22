package com.hand.dao;

import com.hand.dto.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ Author: xin
 * @ Date: 2018/8/21 13:42
 */
@Repository
public class DepartmentDAO {

    public static Map<Integer, Department> departments=null;
    static {
        departments=new HashMap<>();

        departments.put(101,new Department(101,"d-1"));
        departments.put(202,new Department(202,"d-2"));
        departments.put(303,new Department(303,"d-3"));
    }

    public Collection<Department> getAllDepartments(){
        return departments.values();
    }

    public Department getDepartment(Integer id){
        return departments.get(id);
    }

}
