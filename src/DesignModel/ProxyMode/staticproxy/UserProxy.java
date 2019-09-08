package DesignModel.ProxyMode.staticproxy;

/**
 * XXXXXXXXX静态代理模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 18:57 <br>
 */
public class UserProxy implements Iuser {
    private Iuser user = new UserImpl();
    @Override
    public void eat(String s) {
        System.out.println("静态代理前置内容");
        user.eat(s);
        System.out.println("静态代理后置内容");
    }
}

