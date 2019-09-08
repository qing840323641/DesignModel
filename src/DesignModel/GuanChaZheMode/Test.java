package DesignModel.GuanChaZheMode;

/**
 * XXXXXXXXX单例模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 15:15 <br>
 * 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * 优点：
 * 1、观察者和被观察者是抽象耦合的。 2、建立一套触发机制。
 *
 * 缺点：
 * 1、如果一个被观察者对象有很多的直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。 2、如果在观察者和观察目标之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。 3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。
 */
public class Test {
    public static void main(String[] args) {

        XiaoMei xiao_mei = new XiaoMei();//小美
        XiaoWang xiao_wang = new XiaoWang();//小王
        XiaoLi xiao_li = new XiaoLi();//小李

        //小王和小李在小美那里都注册了一下
        xiao_mei.addPerson(xiao_wang);
        xiao_mei.addPerson(xiao_li);

        //小美向小王和小李发送通知
        xiao_mei.notifyPerson();

    }
}

