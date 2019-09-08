package DesignModel.GongChangMode;

import sun.security.provider.SHA;

/**
 * XXXXXXXXX工厂模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 17:26 <br>
 *长方形
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(" Rectangle::调用了画长方形的方法");
    }
}

