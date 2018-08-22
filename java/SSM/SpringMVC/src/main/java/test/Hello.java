package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @ Author: xin
 * @ Date: 2018/8/20 9:30
 */

@Controller
//@RequestMapping("/test")
public class Hello {

    @Autowired
    private HttpServletRequest request;

    //返回值会通过视图解析器解析为实际的物理视图
    //InternalResourceViewReslover解析结果：prefix+return值+suffix

    @RequestMapping(
            value = "/hello"
//          params={"name","password"}      限定request中必须有params    !name表示不包含name
//          params = {"name=admin","password=admin"}   限定request中params必须为指定值
//          method=RequestMethod.POST       指定请求方式
//          headers = {"Accept-Language=zh-CN,zh;q=0.9"}    限定请求头的参数=
    )
    public String say() {

        return "success";
    }

    //GET请求指定资源
    @RequestMapping(value = "/testGet/{id}",method = RequestMethod.GET)
    public String testGet(@PathVariable("id") int id){
        System.out.println("GET"+id);
        return "redirect:/WEB-INF/views/success.jsp";
    }

    //POST上传资源
    @RequestMapping(value = "/testPost",method = RequestMethod.POST)
    public String testPost(){
        System.out.println("POST");
        return "success";
    }
    //DELETE删除指定资源
    @RequestMapping(value = "/testDelete/{id}",method = RequestMethod.DELETE)
    public String testDelete(@PathVariable("id") int id){
        System.out.println("DELETE"+id);
        return "success";
    }
    //PUT更新指定资源
    @RequestMapping(value = "/testPut/{id}",method = RequestMethod.PUT)
    public String testPut(@PathVariable("id") int id){
        System.out.println("PUT"+id);
        return "success";
    }
}
