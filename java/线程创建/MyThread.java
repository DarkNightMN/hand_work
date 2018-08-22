/**
 * @ Author: xin
 * @ Date: 2018/8/7 12:00
 */
public class MyThread extends Thread{
    private int age;
    private String name;

    public MyThread(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public void run() {
        System.out.println("name:"+name+"age:"+age);
    }
}
