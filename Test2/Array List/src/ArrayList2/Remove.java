package ArrayList2;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("aaa");
        s.add("123");
        s.add("345");
        s.add("aaa");
        s.add("aaa");
        s.add("567");

        //不适用增强for循环，因为要i--
        for (int i = 0; i < s.size(); i++) {
            String x = s.get(i);
            //if(x.equals("aaa"))
            //如果变量为null，用变量比较常量会出现空指针异常
            if ("aaa".equals(x)) {
                s.remove("aaa");
                i--;
            }
        }

        for (String a : s) {
            System.out.println(a);
        }
    }
}
