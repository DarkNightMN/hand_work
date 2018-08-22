package test;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.controller.StudentController;
import test.dao.StudentMapper;
import test.pojo.Student;

/**
 * @ Author: xin
 * @ Date: 2018/8/18 16:33
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentController studentController=applicationContext.getBean(StudentController.class);
        Student student=studentController.selectById(2);
        System.out.println(student);
    }
}
