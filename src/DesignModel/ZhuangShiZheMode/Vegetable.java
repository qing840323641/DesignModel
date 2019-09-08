package DesignModel.ZhuangShiZheMode;

/**
 * XXXXXXXXX装饰者模式 © Copyright 2019<br>
 *蔬菜类
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 16:12 <br>
 */
public class Vegetable extends Food {
    private Food basic_food;

    public Vegetable(Food basic_food) {
        this.basic_food = basic_food;
    }

    public String make() {
        return basic_food.make()+"+蔬菜";
    }
}

