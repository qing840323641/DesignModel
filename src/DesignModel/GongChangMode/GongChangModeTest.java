package DesignModel.GongChangMode;

/**
 * XXXXXXXXX工厂模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 17:29 <br>
 * 定义:一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
 * 在工厂模式中，我们在创建对象时不会对客户端暴露创建逻辑，并且是通过使用一个共同的接口来指向新创建的对象。
 *
 * 主要解决：主要解决接口选择的问题。
 * 如何解决:让其子类实现工厂接口，返回的也是一个抽象的产品。
 * 优点：
 * 1、一个调用者想创建一个对象，只要知道其名称就可以了。
 * 2、屏蔽产品的具体实现，调用者只关心产品的接口。
 *
 * 缺点：
 * 每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，
 * 在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
 */
public class GongChangModeTest {
    public static void main(String[] args) {
        //创建模型工厂
        ShapeFactory shapeFactory = new ShapeFactory();
        //获取 Circle 的对象，并调用它的 draw 方法  圆形
        Shape shape1 =  shapeFactory.getShape("CIRCLE");
        //调用 Circle 的 draw 方法
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法  长方形
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法  正方形
        //Shape shape3 = shapeFactory.getShape("SQUARE");

        //调用 Square 的 draw 方法
        //shape3.draw();
    }
}

