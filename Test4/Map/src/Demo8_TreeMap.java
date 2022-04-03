import java.util.Comparator;
import java.util.TreeMap;

/*
目标：TreeMap集合的特点和使用。

TreeMap集合按照键是可排序不重复的键值对集合。(默认升序)
TreeMap集合按照键排序的特点与TreeSet是完全一样的。
小结：
    TreeMap集合和TreeSet集合都是排序不重复集合
    TreeSet集合的底层是基于TreeMap，只是键没有附属值而已。
    所以TreeMap集合指定大小规则有2种方式：
         a.直接为对象的类实现比较器规则接口Comparable，重写比较方法（拓展方式）
         b.直接为集合设置比较器Comparator对象,重写比较方法
 */
public class Demo8_TreeMap {
    public static void main(String[] args) {
        TreeMap<Pig, Double> pigs = new TreeMap<>();    //value: weight
        pigs.put(new Pig("wild boar(野猪)", 5, 199.99), 14.5);
        pigs.put(new Pig("domestic pig(家猪)", 3, 25.9), 5.0);
        pigs.put(new Pig("Zhu BaJie", 300, 19999.99), 300.0);
        pigs.put(new Pig("Peppa Pig(小猪佩奇)", 2, 59.9), 2.0);
        System.out.println(pigs);

        TreeMap<Pig, Double> pigs1 = new TreeMap<>(new Comparator<Pig>() {
            @Override
            public int compare(Pig o1, Pig o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });    //value: weight
        pigs1.put(new Pig("wild boar(野猪)", 5, 199.99), 14.5);
        pigs1.put(new Pig("domestic pig(家猪)", 3, 25.9), 5.0);
        pigs1.put(new Pig("Zhu BaJie", 300, 19999.99), 300.0);
        pigs1.put(new Pig("Peppa Pig(小猪佩奇)", 2, 59.9), 2.0);
        System.out.println(pigs1);
    }
}
