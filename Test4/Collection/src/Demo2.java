import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Demo2 {
/*
    Collection 常用API

    Collection是所有单列集合的父接口，因此在Collection中定义了单列集合(List和Set)通用的一些方法，这些方法可用于操作所有的单列集合。方法如下：

    public boolean add(E e)： 把给定的对象添加到当前集合中 。
    public void clear() :清空集合中所有的元素。
    public boolean remove(E e): 把给定的对象在当前集合中删除。
    public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
    public boolean isEmpty(): 判断当前集合是否为空。
    public int size(): 返回集合中元素的个数。
    public Object[] toArray(): 把集合中的元素，存储到数组中

    tips: 有关Collection中的方法可不止上面这些，其他方法可以自行查看API学习。
*/

    public static void main(String[] args) {
        // HashSet:添加的元素是无序，不重复，无索引。
        Collection<String> sets = new HashSet<>();

        // 1.添加元素，添加成功返回true.
        System.out.println(sets.add("Hilary"));         //实际开发中往往不需要输出是否添加成功
        System.out.println(sets.add("Lewinsky"));
        System.out.println(sets.add("Lili"));
        System.out.println(sets);

        // 2.清空集合的元素。
        sets.clear();
        System.out.println(sets);

        // 3.判断集合是否为空 是空返回true 反之返回false
        System.out.println(sets.isEmpty());
        sets.add("Hilary");
        sets.add("Lewinsky");
        sets.add("Lili");
        System.out.println(sets.isEmpty());

        // 4.获取集合的大小
        System.out.println(sets.size());

        // 5.判断集合中是否包含某个元素 。
        System.out.println(sets.contains("Lewinsky"));
        System.out.println(sets.contains("Clinton"));

        // 6.删除某个元素:如果有多个重复元素默认删除前面的第一个！
        System.out.println(sets.remove("Clinton"));
        System.out.println(sets.remove("Lili"));
        System.out.println(sets);

        // 7.把集合转换成数组
        Object[] objs = sets.toArray();
        String[] strs = sets.toArray(String[]::new);// 以后再了解，指定转换的数组类型！
        System.out.println(Arrays.toString(objs));
        System.out.println(Arrays.toString(strs));

        System.out.println("---------------------拓展----------------------");
        // 把c2集合的元素全部倒入到c1
        Collection<String> c1 = new HashSet<>();
        c1.add("Christina");
        c1.add("Victoria");

        Collection<String> c2 = new HashSet<>();
        c2.add("Victoria");
        c2.add("Janette");

        c1.addAll(c2);
        System.out.println(c1);
    }
}
