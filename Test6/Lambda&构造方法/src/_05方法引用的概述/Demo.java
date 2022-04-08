package _05方法引用的概述;

import java.util.ArrayList;
import java.util.List;

/*
     目标：方法引用的概述。(了解)

     方法引用：
             方法引用是为了进一步简化Lambda表达式的写法。
             方法引用的格式：类型或者对象::引用的方法。
     关键语法是：“::”

     小结：
        方法引用可以进一步简化Lambda表达式的写法。
        关键语法是：“::”
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("name1");
        list.add("name2");
        list.add("name3");

        for (String s : list) {
            System.out.println(s);
        }

        list.forEach(s-> System.out.println(s));

        list.forEach(System.out::println);
    }
}
