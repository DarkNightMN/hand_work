package test.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import test.dao.DepartmentMapper;
import test.dao.StudentMapper;
import test.pojo.Department;
import test.pojo.Student;

/**
 * @ Author: xin
 * @ Date: 2018/8/19 22:55
 */
public class DepartmentService implements DepartmentMapper{
    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public Department selectByDepId(int studentId) {
        return departmentMapper.selectByDepId(studentId);
    }
}
