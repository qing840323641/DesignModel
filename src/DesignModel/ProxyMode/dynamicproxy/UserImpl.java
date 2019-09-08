package DesignModel.ProxyMode.dynamicproxy;

/**
 * XXXXXXXXX动态代理模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 19:09 <br>
 */
public class UserImpl implements Iuser {

    @Override
    public void eat(String s) {
        System.out.println("我要吃"+s);
    }
}

