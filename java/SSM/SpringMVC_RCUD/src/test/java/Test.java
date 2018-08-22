import java.util.HashMap;
import java.util.Map;

/**
 * @ Author: xin
 * @ Date: 2018/8/21 18:16
 */
public class Test {
    public static void main(String[] args) {
        Map<String,Object> map=new HashMap<>();
        map.put("1","hello");
        map.put("1","world");
        System.out.println(map.get("1"));
    }
}
