package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Collections.nCopies(3, "apple"));
        System.out.println(list);
        list.add("dog");
        list.add("pink");
        System.out.println(list);
    }
}
