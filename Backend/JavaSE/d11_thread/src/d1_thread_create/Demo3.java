package d1_thread_create;

public class Demo3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(Thread.currentThread().getName()+"子线程执行输出"+i);
                }
            }
        });
        thread.start();

        new Thread(()->{
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName()+"子线程执行输出"+i);
            }
        }).start();

        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"主线程执行输出"+i);
        }
    }
}
