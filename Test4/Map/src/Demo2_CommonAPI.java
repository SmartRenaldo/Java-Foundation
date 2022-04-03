import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map接口中定义了很多方法，常用的如下：
 * <p>
 * public V put(K key, V value): 把指定的键与指定的值添加到Map集合中。
 * public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
 * public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
 * public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
 * public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
 * public boolean containKey(Object key):判断该集合中是否有此键。
 */
public class Demo2_CommonAPI {
    public static void main(String[] args) {
        Map<String, Double> maps = new HashMap<>();
        // 1.添加元素: 无序，不重复，无索引。
        maps.put("orange", 9.99);
        maps.put("banana", 3.49);
        maps.put("grape", 7.99);
        maps.put("orange", 5.99);
        maps.put("pomelo", 4.99);
        maps.put(null, null);
        System.out.println("1:\n" + maps);
        System.out.println();

        // 2.清空集合
        maps.clear();
        System.out.println("2:\n" + maps);
        System.out.println();

        // 3.判断集合是否为空，为空返回true ,反之返回false
        System.out.println("3:\n" + maps.isEmpty());
        maps.put("orange", 9.99);
        maps.put("banana", 3.49);
        maps.put("grape", 7.99);
        maps.put("orange", 5.99);
        maps.put("pomelo", 4.99);
        System.out.println(maps.isEmpty());
        System.out.println();

        // 4.根据键获取对应值
        System.out.println("4:\n" + maps.get("orange"));
        System.out.println();

        // 5.根据键删除整个元素 (删除键会返回键的值)
        System.out.println("5:");
        System.out.println(maps.remove("pomelo"));
        System.out.println(maps);
        System.out.println(maps.remove("kkkkk"));       //null
        System.out.println(maps);
        System.out.println();

        // 6.判断是否包含某个键 ，包含返回true ,反之返回false
        System.out.println("6:");
        System.out.println(maps.containsKey("orange"));
        System.out.println(maps.containsKey("durian"));
        System.out.println();

        // 7.判断是否包含某个值
        System.out.println("7:");
        System.out.println(maps.containsValue("7.99"));
        System.out.println(maps.containsValue(7.99));
        System.out.println();

        // 8.获取全部键的集合：public Set<K> keySet()
        // Map集合的键是无序不重复的，所以返回的是一个Set集合。
        System.out.println("8:");
        Set<String> strings = maps.keySet();
        strings.forEach(System.out::println);
        System.out.println();

        // 9.获取全部值的集合：Collection<V> values();
        // Map集合的值是不做要求的，可能重复，所以值要用Collection集合接收
        System.out.println("9:");
        Collection<Double> values = maps.values();
        values.forEach(System.out::println);
        System.out.println();

        // 10.集合的大小
        System.out.println("10:\n" + maps.size() + "\n");

        // 11.合并其他Map集合。(拓展)
        System.out.println("11:");
        Map<String, Double> maps2 = new HashMap<>();
        maps2.put("watch", 1999.9);
        maps2.put("refrigerator", 999.99);
        maps2.put("air-conditioning", 2599.99);
        System.out.println(maps2);
        maps.putAll(maps2);
        System.out.println(maps);
    }
}
