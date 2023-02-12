package d1_thread_create;

public class Demo1 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
//        调用star方法启动子线程
        thread.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("主线程执行输出"+i);
        }
    }

}

class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("子线程执行输出"+i);
        }
    }
}
