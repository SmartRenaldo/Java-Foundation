package _12Stream流的常用API;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * concat : 合并流
 * -- public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
 */
public class Demo3_concat {
    public static void main(String[] args) {
        String[] strings = new String[]{"JDK", "JVM", "SVN"};
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 15, 3, 9, 7, -8);

        // 数组流
        Stream<String> stringStream = Stream.of(strings);
        //也可以写成：Stream<String> stringStream = Stream.of(15, 3, 9, 7, -8);

        //集合流
        Stream<Integer> integerStream = list.stream();

        //合并流
        Stream<Object> objectStream = Stream.concat(stringStream, integerStream);
        objectStream.forEach(System.out::println);
    }
}
