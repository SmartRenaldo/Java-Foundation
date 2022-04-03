package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        //创建一个ArrayList集合，这是一行经典代码
        List<String> list = new ArrayList<>();

        list.add("Java1");
        list.add("Java1");
        list.add("Java2");
        list.add("Java2");
        System.out.println("list = " + list);

        list.remove("Java1");
        System.out.println(list);

        Collection<String> strs = new LinkedList<>();
        strs.add("Java2");
        list.removeAll(strs);
        System.out.println("list = " + list);

        list.add("Java1");
        list.add("Java2");
        list.add("Java2");
        System.out.println("list = " + list);

        list.add(3,"MySQL");
        System.out.println(list);

        list.set(1,"Mybatis");
        System.out.println("list = " + list);

        System.out.println(list.get(2));

        strs.add("Java1");
        list.addAll(strs);
        System.out.println("strs = " + strs);
        System.out.println("list = " + list);

        list.remove(2);
        System.out.println("list = " + list);

        System.out.println("list.contains(\"MySQQ\") = " + list.contains("MySQQ"));
        System.out.println("list.contains(\"MySQL\") = " + list.contains("MySQL"));
    }
}
