package test.dao;

import org.apache.ibatis.annotations.Select;
import test.pojo.Student;

/**
 * @ Author: xin
 * @ Date: 2018/8/18 16:41
 */

public interface StudentMapper {

    Student selectById(int studentId);
}
