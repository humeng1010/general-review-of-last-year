package d2_thread_safe;

/**
 * 模拟取钱案例
 */
public class Demo1 {
    public static void main(String[] args) {
        //1、定义线程类，创建一个共享的账户对象
        Account account = new Account("001",100000);

        //2、创建两个线程对象，代表小明和小红同时进来了
        new DrawThread(account,"小明").start();
        new DrawThread(account,"小红").start();
    }
}