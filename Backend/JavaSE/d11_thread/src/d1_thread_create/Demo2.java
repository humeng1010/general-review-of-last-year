package d1_thread_create;

public class Demo2 {
    public static void main(String[] args) {
        Runnable target = new MyRunnable();
        Thread thread = new Thread(target);
        thread.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("主线程执行输出"+i);
        }

    }
}

/**
 * 定义一个线程任务类，实现Runnable接口
 */
class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("子线程执行输出"+i);
        }
    }
}
