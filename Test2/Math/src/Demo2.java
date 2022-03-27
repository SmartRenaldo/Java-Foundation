import java.util.ArrayList;

public class Demo2 {
    /*
        题目：
        计算在-10.8到5.9之间，绝对值大于6或者小于2.1的整数有多少个？
    
        备注：如果使用Math.ceil方法，-10.8可以变成-10.0。
        用int方法可以使數據去掉小數部分
        注意double也是可以进行++的。
    */
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        for (int i = (int) Math.ceil(min); i < max; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                ints.add(i);
                count++;
            }
        }
        System.out.println(ints);
        System.out.println(count);
    }
}
