package DesignModel.singleclass;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * XXXXXXXXX单例模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/28 20:31 <br>
 * 懒汉式就是不在系统加载时就创建类的单例，而是在第一次使用实例的时候再创建。
 */
public class LHanDanli {

    //定义一个私有类变量来存放单例，私有的目的是指外部无法直接获取这个变量，而要使用提供的公共方法来获取
    private static LHanDanli dl = null;

    //定义私有构造器，表示只在类内部使用，亦指单例的实例只能在单例类内部创建
    private LHanDanli() {

    }
    //定义一个公共的公开的方法来返回该类的实例，由于是懒汉式，需要在第一次使用时生成实例，
    // 所以为了线程安全，使用synchronized关键字来确保只会生成单例
    public static LHanDanli getInstance() {
        if (dl == null) {
            dl = new LHanDanli();
        }
        return dl;
    }




    //测试
    public static void main(String[] args) {
        //创建一个可以存放20个线程的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            //执行创建线程(Runable接口)
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+":"+LHanDanli.getInstance());
                }
            });
        }
        //关闭线程池
        threadPool.shutdown();
    }
}

