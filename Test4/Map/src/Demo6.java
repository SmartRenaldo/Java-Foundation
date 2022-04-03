import java.util.HashMap;
import java.util.Map;

public class Demo6 {
    public static void main(String[] args) {
        //1,创建Hashmap集合对象。
        Map<Orange, String> orangeStringMap = new HashMap<>();

        //2,添加元素。
        orangeStringMap.put(new Orange("Orange01", 99.9, "Sale!"), "Adelaide");
        orangeStringMap.put(new Orange("Orange02", 23.5, "Fixed price"), "Utah");
        orangeStringMap.put(new Orange("Orange03", 5.5, "50% off"), "Manchester");
        orangeStringMap.put(new Orange("Orange01", 99.9, "Sale!"), "Perth");

        //3,取出元素。键找值方式
        //默认内容一样即重复需重写hashcode和equals方法
        orangeStringMap.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
    }
}
