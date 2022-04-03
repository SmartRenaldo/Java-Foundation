import java.util.ArrayList;

public class Demo2 {
    /*
        使用泛型的好处

        上一节只是讲解了泛型的引入，那么泛型带来了哪些好处呢？

        将运行时期的ClassCastException，转移到了编译时期变成了编译失败。
        避免了类型强转的麻烦。
        */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Catherine");
        list.add("Tiffany");
        list.add(99.9);
        list.add(false);

        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            String s = (String) o;
            System.out.println(s);
        }
    }
}
