package _08方法引用方式三_特定类型的方法引用;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/*
      目标：方法引用有四种形式：

      1.静态方法的引用。
      2.实例方法的引用。
      3.特定类型方法的引用。
      4.构造器引用。

      3.特定类型方法的引用。
           JAVA提供的特定类型：String, 任何类型。
           格式：特定类型::方法。
           注意：
              如果第一个参数列表中的形参中的第一个参数作为了后面的方法的调用者，
              并且其余参数作为后面方法的形参，那么就可以用特定类型方法引用了。
 */
public class Demo {
    public static void main(String[] args) {
        String[] strings = {"eikqqe", "QAWErolq", "Robert", "Boom", "Cao", "black",
                "Michael", "Linda", "cao", "uiqefgrq", "QEefqg", "efqqeg", "TPOWZ"};

        //要求：忽略大小写升序排列
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        Arrays.sort(strings, (o1, o2) -> {
            return o1.compareToIgnoreCase(o2);
        });

        Arrays.sort(strings, (o1, o2) -> o1.compareToIgnoreCase(o2));

        Arrays.sort(strings, String::compareToIgnoreCase);
    }
}
