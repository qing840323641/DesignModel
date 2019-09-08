package DesignModel.GuanChaZheMode;

/**
 * XXXXXXXXX观察者模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 15:13 <br>
 */
public class XiaoLi implements Person{
    private String name = "小李";

    public XiaoLi() {

    }
    @Override
    public void getMessage(String s) {
        XiaoMei xiaoMei = new XiaoMei();
        System.out.println(name + "接到了小美的电话，内容是：" + s);

    }
}

