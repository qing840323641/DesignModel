package DesignModel.GuanChaZheMode;

/**
 * XXXXX观察者模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 15:13 <br>
 */
public class XiaoWang implements Person {
    private String name = "小王";

    public XiaoWang() {
    }

    @Override
    public void getMessage(String s) {
        System.out.println(name + "接到了小美的电话，内容是：" + s);
    }
}

