import java.util.ArrayList;

public class Demo1 {
    /*
        目标：泛型的概述。

        什么是泛型？
        泛型就是一个标签：<数据类型>
        泛型可以在编译阶段约束只能操作某种数据类型。
        注意：JDK 1.7开始之后，泛型后面的申明可以省略不写!!
        泛型和集合都只能支持引用数据类型，不支持基本数据类型。

        小结：
        泛型可以在编译阶段约束只能操作某种数据类型。
        泛型和集合都只能支持引用数据类型，不支持基本数据类型。
        JDK 1.7开始之后，泛型后面的申明可以省略不写!!
     */
    public static void main(String[] args) {
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("Java");
        listStr.add("MySQL");
        listStr.add("Python");
        System.out.println(listStr);

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(17);
        listInt.add(-9);
        listInt.add(76);
        System.out.println(listInt);

        ArrayList<Character> lishChr = new ArrayList<>();
        lishChr.add('\\');
        lishChr.add(']');
        lishChr.add('?');
        lishChr.add('8');
        System.out.println(lishChr);

        ArrayList<Long> listLng = new ArrayList<>();
        listLng.add(98L);
        listLng.add(-7L);
        listLng.add(1342L);
        System.out.println(listLng);
    }
}
