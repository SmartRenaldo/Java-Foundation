package _04Lambda表达式的省略写法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/*
    Lambda表达式的省略写法（进一步在Lambda表达式的基础上继续简化）
    （1）如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写,同时要省略分号！
    （2）如果Lambda表达式的方法体代码只有一行代码。可以省略大括号不写。
        此时，如果这行代码是return语句，必须省略return不写，同时也必须省略";"不写
    （3）参数类型可以省略不写。
    （4）如果只有一个参数，参数类型可以省略，同时()也可以省略。
 */
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Albert", "Muhammad", "Johnson");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        list.forEach(s -> System.out.println(s));

        list.forEach(System.out::println);
    }
}
