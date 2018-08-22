import java.util.concurrent.Callable;

/**
 * @ Author: xin
 * @ Date: 2018/8/7 11:59
 */
class MyThread3 implements Callable {
    private int age;
    private String name;
    public MyThread3(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public String call() throws Exception {
        return "name:"+name+"age:"+age;
    }
}