package d5_timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);
        pool.scheduleAtFixedRate(()->{
            System.out.println("这个是定时器,每过一秒执行一次");
        },0,1, TimeUnit.SECONDS);

        pool.schedule(()->{
            System.out.println("这个是延时器,1秒后执行一次");
        },1,TimeUnit.SECONDS);
    }
}
