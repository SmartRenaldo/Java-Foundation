package Demo4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GroupManager gM = new GroupManager("Jack", 1000);
        GroupMember mem1 = new GroupMember("Queen", 0);
        GroupMember mem2 = new GroupMember("King", 0);
        GroupMember mem3 = new GroupMember("Joker", 0);

        gM.show();
        mem1.show();
        mem2.show();
        mem3.show();
        System.out.println("-------------------------");

        ArrayList<Integer> redPocket = gM.send(100, 3);

        mem1.receive(redPocket);
        mem2.receive(redPocket);
        mem3.receive(redPocket);

        gM.show();
        mem1.show();
        mem2.show();
        mem3.show();
    }
}
