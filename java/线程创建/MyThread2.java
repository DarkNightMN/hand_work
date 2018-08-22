/**
 * @ Author: xin
 * @ Date: 2018/8/7 11:59
 */
public class MyThread2 implements Runnable{
    private int age;
    private String name;

    public MyThread2(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public void run() {
        System.out.println("name:"+name+"age:"+age);
    }
}
