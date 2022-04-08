package _03Lambda简化Comparator接口匿名内部类写法;

import java.util.*;

/*
    目标：Lambda简化Comparator接口匿名内部类写法;
 */
public class Demo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("王子瑜", 23, '女');
        Student student2 = new Student("赵自强", 21, '男');
        Student student3 = new Student("杨景涛", 24, '男');
        Collections.addAll(list, student1, student2, student3);

        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        list.sort((Student s1, Student s2) -> {
            return s1.getAge() - s2.getAge();
        });

        list.sort((Student t1, Student t2) -> t1.getAge() - t2.getAge());

        list.sort((s1, s2) -> s1.getAge() - s2.getAge());

        list.forEach(student -> System.out.println(student));
    }
}
