package com.hand.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hand.service.TestService;

/**
 * @ Author: xin
 * @ Date: 2018/8/22 11:10
 */
@Controller
public class TestController {

    @Autowired
    private TestService testService;

    public TestController() {
        System.out.println("TestController");
    }

    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
