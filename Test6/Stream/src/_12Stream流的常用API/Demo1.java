package _12Stream流的常用API;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标：Stream流的常用API
 * forEach : 逐一处理(遍历)
 * count：统计个数
 * -- long count();
 * filter : 过滤元素
 * -- Stream<T> filter(Predicate<? super T> predicate)
 * limit : 取前几个元素
 * skip : 跳过前几个
 * map : （映射）: 加工方法（把原来的元素加工以后，从新放上去）
 * -- <R> Stream<R> map(Function<? super T, ? extends R> mapper);
 * concat : 合并流
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        list.stream().filter(s -> s.length() == 3).filter(s -> s.startsWith("张"))
                .forEach(System.out::println);

        long count = list.stream().filter(s -> s.length() == 3)
                .filter(s -> s.startsWith("张")).count();
        System.out.println("count = " + count);

        //取前2个
        list.stream().filter(s -> s.length() == 3).filter(s -> s.startsWith("张"))
                .limit(2).forEach(System.out::println);
        System.out.println();

        //跳过前2个
        list.stream().filter(s -> s.length() == 3).filter(s -> s.startsWith("张"))
                .skip(2).forEach(System.out::println);
    }
}
