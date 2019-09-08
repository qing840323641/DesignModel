package DesignModel.singleclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * XXXXXXXXX单例模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/28 21:27 <br>
 * 双重校验锁
 */
public class DoubleCheckLock {
    private volatile static DoubleCheckLock singleton;
    private DoubleCheckLock (){}
    public static DoubleCheckLock getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckLock.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckLock();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) {
        //创建一个可以存放20个线程的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            //执行创建线程(Runable接口)
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":"+DoubleCheckLock.getSingleton());
                }
            });
        }
        //关闭线程池
        threadPool.shutdown();
    }
}

