package ArrayList1;

import java.util.ArrayList;

public class Demo3 {
    /*
        移除
        remove(Object o):移除此列表中首次出现的指定元素（如果存在）
        remove(int index):移除此列表中指定位置上的元素。

        替代:
        set(int index, E element): 用指定的元素替代此列表中指定位置上的元素

        返回:
        size(): 返回此列表中的元素数
        get(int index): 返回此列表中指定位置上的元素
    */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("asd");
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");

        System.out.println("list = " + list);
        int size = list.size();
        System.out.println("size = " + size);

        String s1 = list.get(0);
        String s2 = list.get(1);
        String s3 = list.get(2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        String s = list.set(0, "666");
        System.out.println("s = " + s);
        System.out.println("list = " + list);

        boolean b1 = list.remove("asd");
        boolean b2 = list.remove("666");
        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("list = " + list);

        String str = list.remove(0);
        System.out.println("str = " + str);
        System.out.println("list = " + list);
    }

}
