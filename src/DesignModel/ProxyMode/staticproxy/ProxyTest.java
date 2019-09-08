package DesignModel.ProxyMode.staticproxy;

/**
 * XXXXXXXXX静态代理模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 18:58 <br>
 */
public class ProxyTest {
    public static void main(String[] args) {
        UserProxy proxy = new UserProxy();
        proxy.eat("苹果");
    }
}

