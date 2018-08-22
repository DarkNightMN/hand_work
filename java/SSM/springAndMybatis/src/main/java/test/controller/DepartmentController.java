package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import test.daoImpl.DepartmentService;
import test.pojo.Department;

/**
 * @ Author: xin
 * @ Date: 2018/8/19 22:55
 */
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    public Department selectByDepId(int departmentId) {
        return departmentService.selectByDepId(departmentId);
    }
}
