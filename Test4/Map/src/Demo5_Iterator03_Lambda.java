import java.util.HashMap;
import java.util.Map;

public class Demo5_Iterator03_Lambda {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        // 1.添加元素: 无序，不重复，无索引。
        maps.put("娃娃", 30);
        maps.put("iphoneX", 100);//  Map集合后面重复的键对应的元素会覆盖前面重复的整个元素！
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        System.out.println(maps);
        // maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}

        maps.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
    }
}
