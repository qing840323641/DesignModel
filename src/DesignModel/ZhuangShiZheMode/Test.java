package DesignModel.ZhuangShiZheMode;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * XXXXXXXXX装饰者模式 © Copyright 2019<br>
 *测试类
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 16:12 <br>
 * 定义:在不改变对象自身的基础上,在程序运行期间给对像动态的添加职责/功能.
 *
 */

public class Test {
    public static void main(String[] args) {
                        //面包       -蔬菜       -奶油
        Food food = new Bread(new Vegetable(new Cream(new Food("三明治"))));
        System.out.println(food.make());
        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();

    }
}


