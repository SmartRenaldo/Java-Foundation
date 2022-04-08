package _06方法引用方式一_静态方法的引用;

import _03Lambda简化Comparator接口匿名内部类写法.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
   目标：方法引用有四种形式：
        1.静态方法的引用。
        2.实例方法的引用。
        3.特定类型方法的引用。
        4.构造器引用。

   1.静态方法的引用。
      引用格式：
         类名::静态方法。
      简化步骤：
         a.定义一个静态方法，把需要简化的代码放到一个静态方法中去。
      静态方法引用的注意事项
         ” 重要：被引用的方法的参数列表要和函数式接口中的抽象方法的参数列表一致。“
   小结：
        静态方法引用的格式： 类名::静态方法。
        重要：被引用的方法的参数列表要和函数式接口中的抽象方法的参数列表一致,才可以引用简化！
 */
public class Demo {
    public static void main(String[] args) {
        List<Student2> list = new ArrayList<>();
        Student2 student1 = new Student2("王子瑜", 23, '女');
        Student2 student2 = new Student2("赵自强", 21, '男');
        Student2 student3 = new Student2("杨景涛", 24, '男');
        Collections.addAll(list, student1, student2, student3);

        list.sort((Student2 o1, Student2 o2) -> o1.getAge() - o2.getAge());

        list.sort((o1, o2) -> o1.getAge() - o2.getAge());

        list.sort((o1, o2) -> Student2.SortByAge(o1, o2));

        list.sort(Student2::SortByAge);

        list.forEach(System.out::println);
    }
}
