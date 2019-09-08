package DesignModel.GuanChaZheMode;

import java.util.ArrayList;
import java.util.List;

/**
 * XXXXXXXXX观察者模式 © Copyright 2019<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/8/29 15:14 <br>
 */
public class XiaoMei {

    List<Person> list = new ArrayList<Person>();
    public XiaoMei(){
    }

    public void addPerson(Person person){
        list.add(person);

    }

    //遍历list，把自己的通知发送给所有暗恋自己的人
    public void notifyPerson() {
        for(Person person:list){
            person.getMessage("下班后一起去吃饭啊!!");
        }
    }
}

