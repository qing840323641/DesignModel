package DesignModel.ZhuangShiZheMode;

/**
 * XXXXXXXXX装饰者模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 16:09 <br>
 */
public class Food {
    private String food_name;

    public Food() {
    }

    public Food(String food_name) {
        this.food_name = food_name;
    }

    public String make() {
        return food_name;
    }
}

