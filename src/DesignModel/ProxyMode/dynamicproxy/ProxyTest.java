package DesignModel.ProxyMode.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * XXXXXXXXX动态代理模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 19:11 <br>
 *
 * 动态代理与静态代理模式原理是一样的，只是动态代理类的源码是在程序运行期间由JVM根据反射等机制动态的生成
 * 所以不存在代理类的字节码文件。代理者和委托者的关系是在程序运行时确定。
 */
public class ProxyTest {
    public static void main(String[] args) {
        Iuser user = new UserImpl();
        InvocationHandler h = new DynamicProxy(user);
        Iuser proxy = (Iuser) Proxy.newProxyInstance(Iuser.class.getClassLoader(), new Class[]{Iuser.class}, h);
        proxy.eat("苹果");
    }
}

