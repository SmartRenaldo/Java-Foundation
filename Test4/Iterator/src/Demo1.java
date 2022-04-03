import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo1 {
/*
    目标：Collection集合的遍历方式。

    什么是遍历? 为什么开发中要遍历？
    遍历就是一个一个的把容器中的元素访问一遍。
    开发中经常要统计元素的总和，找最值，找出某个数据然后干掉等等业务都需要遍历。

    Collection集合的遍历方式是全部集合都可以直接使用的，所以我们学习它。
    Collection集合的遍历方式有三种:
            （1）迭代器。
            （2）foreach(增强for循环)。
            （3）JDK 1.8开始之后的新技术Lambda表达式(了解)

    a.迭代器遍历集合。
            -- 方法：
    public Iterator iterator(): 获取集合对应的迭代器，用来遍历集合中的元素的
    E next():获取下一个元素值！
    boolean hasNext():判断是否有下一个元素，有返回true ,反之。
            --流程：
            1.先获取当前集合的迭代器
    Iterator<String> it = lists.iterator();
        2.定义一个while循环，问一次取一次。
            通过it.hasNext()询问是否有下一个元素，有就通过
          it.next()取出下一个元素。
    小结：
    记住！
    */
    public static void main(String[] args) {
        Collection<String> sets = new TreeSet<>();
        sets.add("Catherine");
        sets.add("Janette");
        sets.add("Victoria");
        sets.add("Judy");
        sets.add("Robin");
        System.out.println(sets);

        //得到集合的迭代器对象
        Iterator<String> itr = sets.iterator();
/*
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());         //NoSuchElementException
        */

        while (itr.hasNext()){
            System.out.println(itr.next());
            //System.out.println(itr.next());     //NoSuchElementException
        }
    }
}
