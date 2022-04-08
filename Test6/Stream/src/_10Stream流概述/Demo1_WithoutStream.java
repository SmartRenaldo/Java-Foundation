package _10Stream流概述;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    目标： 演示Stream流的强大。

    什么是Stream流？
        在Java 8中，得益于Lambda所带来的函数式编程，
        引入了一个全新的Stream流概念 ，用于解决已有集合/数组类库有的弊端。

    Stream流能解决什么问题?
        可以解决已有集合类库或者数组API的弊端。
        Stream认为集合和数组操作的API很不好用，所以采用了Stream流简化集合和数组的操作！！

    小结：
        Stream流是用来简化集合类库或者数组API的弊端。
        Stream流其实就一根传送带，元素在上面可以被Stream流操作。
 */
public class Demo1_WithoutStream {
    public static void main(String[] args) {
        // 需求：从集合中筛选出所有姓张的人出来。然后再找出姓名长度是3的人
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "张三丰", "灭绝", "张强", "郑普元", "张无忌");

        //1. 找出姓张的人
        List<String> zhangList = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                zhangList.add(s);
            }
        }

        //2. 找出姓张的人中姓名长度为3的人
        List<String> twoLengthList = new ArrayList<>();
        for (String s : zhangList) {
            if (s.length() == 3) {
                twoLengthList.add(s);
            }
        }

        twoLengthList.forEach(System.out::println);
    }
}
