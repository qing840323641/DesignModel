package DesignModel.ZhuangShiZheMode;

/**
 * XXXXXXXXX装饰者模式 © Copyright 2019<br>
 *奶油类
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 16:10 <br>
 */
public class Cream extends  Food{
    private Food basic_food;

    public Cream(Food basic_food) {
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make()+"+奶油";
    }
}

