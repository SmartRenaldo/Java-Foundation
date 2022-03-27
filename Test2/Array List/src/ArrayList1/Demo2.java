package ArrayList1;

import java.util.ArrayList;

public class Demo2 {
    //ArrayList: 构造一个初始容量为 10 的空列表
        /*
        boolean add(E e): 将指定的元素添加到此列表的尾部
        void add(int index, E element): 将指定的元素插入此列表中的指定位置
        */
        /*
        注意: 集合容器中没有加入<>就可以存储任意数据类型
        有<>只能存储相应数据类型
        <>: 泛型
        */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(123);
        list.add(true);
        //打印String,StringBuilder和ArrayList的对象名都不会打印其地址
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(234);
        list2.add(234);
        list2.add(123);
        list2.add(0,666);
        list2.add(0,777);
        System.out.println(list2);

        ArrayList<Long> list3 = new ArrayList<>();
        list3.add(5325L);
        list3.add(13142L);
        list3.add(13424L);
        System.out.println(list3);
    }
}
