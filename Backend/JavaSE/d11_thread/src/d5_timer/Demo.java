package d5_timer;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo {
    private static int num = 0;
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
//        延时器 类似于setTimeout
        pool.schedule(()->{
            System.out.println(Thread.currentThread().getName()+"执行输出：AAA"+"====>"+new Date());
        },2000, TimeUnit.MILLISECONDS);

        //2、开启定时器任务
        pool.scheduleAtFixedRate(()->{
            System.out.println(Thread.currentThread().getName()+"执行输出：BBB"+"====>"+new Date());
        },0,2, TimeUnit.SECONDS);

        //2、开启定时器任务
        pool.scheduleAtFixedRate(()->{
            System.out.println(num++);
        },0,1, TimeUnit.SECONDS);
    }
}
