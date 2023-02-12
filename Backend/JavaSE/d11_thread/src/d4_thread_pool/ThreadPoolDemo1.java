package d4_thread_pool;


import java.util.concurrent.*;

/**
 * 自定义一个线程池对象，并且测试其特性
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        /*
        public ThreadPoolExecutor(int corePoolSize,
        int maximumPoolSize,
        long keepAliveTime,
        TimeUnit unit,
        BlockingQueue<Runnable> workQueue,
        ThreadFactory threadFactory,
        RejectedExecutionHandler handler)
        */
        /*ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                3,
                5,
                8,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(6),//FIFO 6个任务队列
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        Runnable runnable = new MyRunnable();
//        核心线程
        poolExecutor.execute(runnable);
        poolExecutor.execute(runnable);
        poolExecutor.execute(runnable);

//        任务队列
        poolExecutor.execute(runnable);
        poolExecutor.execute(runnable);
        poolExecutor.execute(runnable);
        poolExecutor.execute(runnable);
        poolExecutor.execute(runnable);
        poolExecutor.execute(runnable);

//        临时线程
        poolExecutor.execute(runnable);
        poolExecutor.execute(runnable);

//        拒绝策略
        poolExecutor.execute(runnable);*/


        ExecutorService pool = Executors.newFixedThreadPool(3);
        /**
         * ExecutorService pool = Executors.newFixedThreadPool(3);
         * 源码的做法：就是在内部new了一个ThreadPoolExecutor给了一些参数
         * 核心线程3个，最大线程3个（没有临时线程），没有空闲时间（都是不死线程，没有临时线程，不需要配置空闲时间），任务队列没有限制任务数量
         * public static ExecutorService newFixedThreadPool(int nThreads) {
         *         return new ThreadPoolExecutor(nThreads, nThreads,
         *                                       0L, TimeUnit.MILLISECONDS,
         *                                       new LinkedBlockingQueue<Runnable>());
         *     }
         */
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        //任务队列不受控制
        pool.execute(new MyRunnable());//已经没有多余线程了
        pool.execute(new MyRunnable());//已经没有多余线程了
        pool.execute(new MyRunnable());//已经没有多余线程了
        pool.execute(new MyRunnable());//已经没有多余线程了
        pool.execute(new MyRunnable());//已经没有多余线程了





    }
}