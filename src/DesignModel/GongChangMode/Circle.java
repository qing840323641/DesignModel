package DesignModel.GongChangMode;

import sun.security.provider.SHA;

/**
 * XXXXXXXXX工厂模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 17:28 <br>
 *     圆形
 */
public class Circle  implements Shape  {
    @Override
    public void draw() {
        System.out.println("Circle::调用了画圆形的方法");

    }
}

