import java.util.Arrays;

public class Demo1 {
    /**
     * 目标：可变参数。
     *
     * 可变参数用在形参中可以接收多个数据。
     * 可变参数的格式：数据类型... 参数名称
     *
     * 可变参数的作用：
     *      传输参数非常灵活，方便。
     *      可以不传输参数。
     *      可以传输一个参数。
     *      可以传输多个参数。
     *      可以传输一个数组。
     *
     * 可变参数在方法内部本质上就是一个数组。
     * 可变参数的注意事项：
     *         1.一个形参列表中可变参数只能有一个！！
     *         2.可变参数必须放在形参列表的最后面！！
     * 小结：
     *      可变参数的作用：传输参数非常灵活，方便。
     *      可变参数的注意事项：
     *      1.一个形参列表中可变参数只能有一个！！
     *      2.可变参数必须放在形参列表的最后面！！
     */
    public static void main(String[] args) {
        show();
        show(1);
        show(11,22,33);
        show(new int[]{11,33,55,77,99});
    }

    public static void show(int...nums){
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("--------------------");
    }
}
