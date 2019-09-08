package DesignModel.singleclass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * XXXXXXXXX单例模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/28 20:47 <br>
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 何时使用：当您想控制实例数目，节省系统资源的时候。
 * 饿汉式
 *
 */
public class EHanDanli {

    private static EHanDanli instance = new EHanDanli();
    private EHanDanli (){}
    public static EHanDanli getInstance() {
        return instance;
    }




    public static void main(String[] args) {
        //创建一个可以存放20个线程的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            //执行创建线程(Runable接口)
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":"+EHanDanli.getInstance());
                }
            });
        }
        //关闭线程池
        threadPool.shutdown();
    }
}

