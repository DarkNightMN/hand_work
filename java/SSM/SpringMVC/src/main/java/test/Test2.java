package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @ Author: xin
 * @ Date: 2018/8/20 17:25
 */
@Controller
public class Test2 {

    @RequestMapping("/test2")
    public String test(Map<String,Object> map){
        map.put("aaa","jsp");
        return "success";
    }

    @RequestMapping("/test22")
    public String test22(@RequestParam("name") String name,
                         @RequestParam(value = "password",required = true,defaultValue = "") String password ){
        return "success";
    }

    @RequestMapping("/testReqHead")
    public String testReqHead(@RequestHeader(value = "Accept-Language") String s ){
        System.out.println(s);
        return "success";
    }

    @RequestMapping("/testCookie")
    public String testCookie(@CookieValue("JSESSIONID") String s){
        System.out.println(s);
        return "success";
    }
}
