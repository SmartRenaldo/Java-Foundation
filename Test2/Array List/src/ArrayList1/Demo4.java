package ArrayList1;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("123");
        list.add("asd");
        list.add("333");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
