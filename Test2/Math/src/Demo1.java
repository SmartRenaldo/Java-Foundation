public class Demo1 {
    /*
        java.util.Math是数学相关的工具类，里面提供了大量的静态方法，完成数学相关的运算操作
        public static double abs(double num);获取绝对值。有多种重载；
        public static double ceil(double num);向上取整。
        public static double floor(double num);向下取整。
        public static long round(double num);四舍五入。
        Math.PI近似圆周率
        Math.E 自然對數
    */
    public static void main(String[] args) {
        System.out.println(Math.abs(3));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-9.34444));
        System.out.println();

        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.0));
        System.out.println();

        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(3.1));
        System.out.println(Math.floor(4));
        System.out.println();

        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));
        System.out.println();

        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
}
