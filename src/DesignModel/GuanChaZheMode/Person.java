package DesignModel.GuanChaZheMode;

/**
 * XXXXXXXXX观察者模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 15:12 <br>
 */
public interface Person {
    //小王和小李通过这个接口可以接收到小美发过来的消息
    void getMessage(String s);
}
