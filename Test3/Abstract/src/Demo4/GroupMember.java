package Demo4;

import java.util.ArrayList;
import java.util.Random;

public class GroupMember extends User {
    public GroupMember() {
    }

    public GroupMember(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list) {
        int index = new Random().nextInt(list.size());
        int delta = list.remove(index);
        int money = this.getMoney();       //自己原来有多少钱
        this.setMoney(delta + money);      //重新设置已有金额
    }
}
