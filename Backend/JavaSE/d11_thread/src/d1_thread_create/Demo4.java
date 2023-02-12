package d1_thread_create;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo4 {
    public static void main(String[] args) {
        Callable<String> callable = new MyCallable(100);
        FutureTask<String> task = new FutureTask<>(callable);
        Thread thread = new Thread(task);
        thread.start();
        try{
            String s = task.get();
            System.out.println("第一个结果："+s);

        }catch (Exception e){
            e.printStackTrace();
        }

        Callable<String> call2 = new MyCallable(200);
        FutureTask<String> task2 = new FutureTask<>(call2);
        Thread thread2 = new Thread(task2);
        thread2.start();
        try {
            String rs2 = task2.get();
            System.out.println("第二个结果："+rs2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
/**
 * 定义一个任务类，实现Callable接口，应该声明线程任务执行完毕后的结果数据类型
 */
class MyCallable implements Callable<String>{
    //计算1到n的和
    private final int n;

    public MyCallable(int n) {
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return "子线程执行的结果为：" + sum;
    }
}
