import java.util.concurrent.*;

/**
 * @ Author: xin
 * @ Date: 2018/8/7 12:00
 */
public class ThreadMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyThread t1=new MyThread("zhang",10);
        MyThread2 t2=new MyThread2("li",20);
        MyThread3 t3=new MyThread3("wang",30);

        //Thread类才有start方法
        t1.start();

        new Thread(t2).start();

        //Callable接口方式，需要FutureTask类来接收call()返回值
        FutureTask<String> result=new FutureTask<>(t3);
        new Thread(result).start();
        System.out.println(result.get());

        //线程池
        ThreadPoolExecutor pool=new ThreadPoolExecutor(5,10,100,TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(5));
        for (int i=0;i<15;i++){
            Test t=new Test(i);
            pool.execute(t);
            System.out.println("线程池中线程数目："+pool.getPoolSize()+","+
                                "已完成："+pool.getCompletedTaskCount()+","+
                                "队列中："+pool.getQueue().size());
        }
        pool.shutdown();
    }
}
