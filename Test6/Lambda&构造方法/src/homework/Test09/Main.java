package homework.Test09;

import java.util.*;

/**
 * 使用lambda表达式对List，Set，Map集合进行遍历
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("------------List-----------");
        List<Student> list = new ArrayList<>();
        Collections.addAll(list, new Student("zhang", 98.67), new Student("wang", 56.46),
                new Student("liu", 72.35), new Student("wen", 67.86),
                new Student("li", 85.99), new Student("peng", 79.99),
                new Student("yun", 94.24), new Student("ma", 90.78));
        list.forEach(System.out::println);

        System.out.println("------------Set-----------");
        Set<Student> set = new HashSet<>();
        Collections.addAll(set, new Student("zhang", 98.67), new Student("wang", 56.46),
                new Student("liu", 72.35), new Student("wen", 67.86),
                new Student("li", 85.99), new Student("peng", 79.99),
                new Student("yun", 94.24), new Student("ma", 90.78));
        set.forEach(System.out::println);

        System.out.println("------------Map-----------");
        Map<Student, Integer> map = new HashMap<>();
        map.put(new Student("zhang", 98.67), 80);
        map.put(new Student("wang", 56.46), 90);
        map.put(new Student("liu", 72.35), 69);
        map.put(new Student("wen", 67.86), 75);
        map.forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
