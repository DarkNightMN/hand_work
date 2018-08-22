package test2;

import dto.Department;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import dto.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author: xin
 * @ Date: 2018/8/20 19:20
 */
@Controller
@SessionAttributes({"student"})
public class Test {

    @RequestMapping("/testPojo")
    public String test(Student student){
        System.out.println(student);
        return "success";
    }

    @RequestMapping("/testS")
    public String testS(Student student){
        System.out.println(student);
        return "success";
    }

    @RequestMapping("/testMAndV")
    public ModelAndView testMAndV(){
        String viewName="success";
        ModelAndView modelAndView=new ModelAndView(viewName);
        modelAndView.addObject("name","张三");
        return modelAndView;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("name","张三");
        return "success";
    }

    @RequestMapping("/testSession")
    public String testSession(Map<String,Object> map){
        Student student=new Student(1,"李四",20,
                new Department(1,"d1"));
        map.put("student",student);
        return "success";
    }


    @ModelAttribute     //在执行目标方法之前被SpringMVC调用
    public void getStudent(@RequestParam(value = "studentId",required = false) Integer id,Map<String,Object> map){
        if(id!=null){
            //模拟select from 数据库
            Student student=new Student(1,"张三",20,
                    new Department(1,"d1"));
            map.put("student",student);
        }
    }

    @RequestMapping("/testModelAttr")
    public String testModelAttr(Student student){
        System.out.println(student);
        return "success";
    }

    @RequestMapping("/testViewAndViewResolver")
    public String testViewAndViewResolver(){
        System.out.println("testViewAndViewResolver");
        return "success";
    }

    @RequestMapping("/testMyView")
    public String testMyView(){
        System.out.println("testMyView");
        return "myView";
    }
}
