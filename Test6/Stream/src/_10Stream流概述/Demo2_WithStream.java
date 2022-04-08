package _10Stream流概述;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2_WithStream {
    public static void main(String[] args) {
        // 需求：从集合中筛选出所有姓张的人出来。然后再找出姓名长度是3的人
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "灭绝", "张强", "郑普元", "张无忌");

        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
