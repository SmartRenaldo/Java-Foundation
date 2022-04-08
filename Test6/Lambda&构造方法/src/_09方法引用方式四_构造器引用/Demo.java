package _09方法引用方式四_构造器引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;

/*
   目标：方法引用有四种形式：
        1.静态方法的引用。
        2.实例方法的引用。
        3.特定类型方法的引用。
        4.构造器引用。
   4.构造器引用。
      格式是：类名::new。
      注意点：前后参数一致的情况下，又在创建对象就可以使用构造器引用
      s -> new Student(s) => Student::new

   小结：
        方法引用是可遇不可求，能用则用，不能用就不要用！
*/
public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Sophia");
        list.add("Kevin");
        list.add("Lauren");

        Object[] objects = list.toArray();
        System.out.println("Arrays.toString(objects) = " + Arrays.toString(objects));

        String[] strings1 = list.toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                //也可以写成return new String[0];
                return new String[value];
            }
        });
        System.out.println("Arrays.toString(strings1) = " + Arrays.toString(strings1));

        String[] strings2 = list.toArray((int i) -> {
            return new String[i];
        });
        System.out.println("Arrays.toString(strings2) = " + Arrays.toString(strings2));

        String[] strings3 = list.toArray(i -> new String[i]);
        System.out.println("Arrays.toString(strings3) = " + Arrays.toString(strings3));

        String[] strings4 = list.toArray(String[]::new);
        System.out.println("Arrays.toString(strings4) = " + Arrays.toString(strings4));
    }
}
