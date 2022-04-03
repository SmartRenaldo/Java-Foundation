package GoThroughList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 拓展：List系列集合的遍历方式有：4种。
 * <p>
 * List系列集合多了索引，所以多了一种按照索引遍历集合的for循环。
 * <p>
 * List遍历方式：
 * （1）for循环。
 * （2）迭代器。
 * （3）foreach。
 * （4）JDK 1.8新技术。
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("MySQL");
        list.add("Mybatis");

        System.out.println(list);

        //1. for loop (List only)
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //2. Iterator
        Iterator<String> iterator = list.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //3. foreach
        for (String s : list) {
            System.out.println(s);
        }

        //4. Lambda
        list.forEach(System.out::println);
    }
}
