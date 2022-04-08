package _12Stream流的常用API;

import java.util.ArrayList;
import java.util.List;

public class Demo2_map {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        // 需求：把名称都加上“黑马的:+xxx”
        list.stream().map(s -> "黑马的：" + s).forEach(System.out::println);
        System.out.println();

        // 需求：把名称都加工厂学生对象放上去
        //list.stream().map(s -> new Student(s)).forEach(System.out::println);
        list.stream().map(Student::new).forEach(System.out::println);
    }
}
