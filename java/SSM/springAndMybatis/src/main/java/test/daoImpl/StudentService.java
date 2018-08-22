package test.daoImpl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import test.dao.StudentMapper;
import test.pojo.Student;

/**
 * @ Author: xin
 * @ Date: 2018/8/18 17:05
 */
public class StudentService implements StudentMapper{

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student selectById(int studentId) {
        return studentMapper.selectById(studentId);
    }
}
