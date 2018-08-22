/**
 * @ Author: xin
 * @ Date: 2018/8/7 14:09
 */
public class Test extends Thread{
    private int num;
    public Test(int num){
        this.num=num;
    }

    @Override
    public void run() {
        System.out.println(num+"开始执行");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(num+"完成");
    }
}
