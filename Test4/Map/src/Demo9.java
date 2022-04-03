import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo9 {
    /*
    Map集合练习

    需求：

    输入一个字符串中每个字符出现次数。

    分析：

    获取一个字符串对象
    创建一个Map集合，键代表字符，值代表次数。
    遍历字符串得到每个字符。
    判断Map中是否有该键。
    如果没有，第一次出现，存储次数为1；如果有，则说明已经出现过，获取到对应的值进行++，再次存储。
    打印最终结果
     */
    public static void main(String[] args) {
        System.out.print("Please enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }
}
