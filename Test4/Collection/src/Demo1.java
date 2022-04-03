import java.util.*;

public class Demo1 {
/*
    目标：Collection集合概述。

    什么是集合?
    集合是一个大小可变的容器。
    容器中的每个数据称为一个元素。数据==元素。
    集合的特点是：类型可以不确定，大小不固定。集合有很多种，不同的集合特点和使用场景不同。
    数组：类型和长度一旦定义出来就都固定了。

    集合有啥用？
    在开发中，很多时候元素的个数是不确定的。
    而且经常要进行元素的增删该查操作，集合都是非常合适的。
    开发中集合用的更多!!

    Java中集合的代表是：Collection.
            Collection集合是Java中集合的祖宗类。
    学习Collection集合的功能，那么一切集合都可以用这些功能！！

    Collection集合的体系:
            Collection<E>(接口)
            /                                \
            Set<E>(接口)                            List<E>(接口)
            /               \                       /                \
            HashSet<E>(实现类)  TreeSet<>(实现类)     ArrayList<E>(实现类)  LinekdList<>(实现类)
            /
            LinkedHashSet<>(实现类)

    集合的特点：
    Set系列集合：添加的元素是无序，不重复，无索引的。
            -- HashSet:添加的元素是无序，不重复，无索引的。
            -- LinkedHashSet:添加的元素是有序，不重复，无索引的。
            -- TreeSet:不重复，无索引，按照大小默认升序排序!!
    List系列集合：添加的元素是有序，可重复，有索引。
            -- ArrayList：添加的元素是有序，可重复，有索引。
            -- LinekdList：添加的元素是有序，可重复，有索引。
    小结：
    Collection是集合的祖宗类，Collection集合的功能是一切集合都可以直接使用的。
    */
    public static void main(String[] args) {
        //HashSet: 无序，不重复，无索引
        Collection<String> sets = new HashSet<>();
        sets.add("MyBatis");
        sets.add("Java");
        sets.add("Java");
        sets.add("Spring");
        sets.add("MySQL");
        sets.add("MySQL");
        System.out.println(sets);       //[Java, MySQL, MyBatis, Spring]

        Collection<String> treeSet = new TreeSet<>();
        treeSet.add("MyBatis");
        treeSet.add("Java");
        treeSet.add("Java");
        treeSet.add("Spring");
        treeSet.add("MySQL");
        treeSet.add("MySQL");
        System.out.println(treeSet);       //[Java, MyBatis, MySQL, Spring]

        //倒序排列
        Collection<String> treeSet2 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treeSet2.add("MyBatis");
        treeSet2.add("Java");
        treeSet2.add("Java");
        treeSet2.add("Spring");
        treeSet2.add("MySQL");
        treeSet2.add("MySQL");
        System.out.println(treeSet2);       //[Java, MyBatis, MySQL, Spring]

        //ArrayList: 有序，可重复，有索引
        Collection<String> lists = new ArrayList<>();
        lists.add("MyBatis");
        lists.add("Java");
        lists.add("Java");
        lists.add("Spring");
        lists.add("MySQL");
        lists.add("MySQL");
        System.out.println(lists);      //[MyBatis, Java, Java, Spring, MySQL, MySQL]
        lists.remove("Java");
        System.out.println(lists);
        ArrayList<String> arrLists = new ArrayList<>(lists);
        arrLists.add(4,"Java");
        System.out.println(arrLists);
        arrLists.remove(3);
        System.out.println(arrLists);
        arrLists.set(3,"Python");
        System.out.println(arrLists);
        System.out.println(arrLists.get(4));
    }
}
