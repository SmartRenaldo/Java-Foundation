package Demo4;

import java.util.ArrayList;

public class GroupManager extends User {
    public GroupManager() {
    }

    public GroupManager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int count) {
        ArrayList<Integer> rPL = new ArrayList<>();     //store the amount of each red pocket
        int leftMoney = this.getMoney();       //store how much money the group leader has
        if (totalMoney > leftMoney) {
            System.out.println("Sorry, your credit is running low");
            return rPL;
        }
        this.setMoney(leftMoney - totalMoney);

        int avg = totalMoney / count;
        int mob = totalMoney % count;

        for (int i = 0; i < count - 1; i++) {
            rPL.add(avg);
        }
        rPL.add(avg + mob);

        return rPL;
    }
}
