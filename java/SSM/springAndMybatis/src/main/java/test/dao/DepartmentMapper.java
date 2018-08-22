package test.dao;

import test.pojo.Department;
import test.pojo.Student;

/**
 * @ Author: xin
 * @ Date: 2018/8/19 22:55
 */
public interface DepartmentMapper {
    Department selectByDepId(int departmentId);
}
