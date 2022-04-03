public class Demo4 {
    /*
        目标：自定义泛型方法。

        什么是泛型方法？
        定义了泛型的方法就是泛型方法。
        泛型方法的定义格式:
        修饰符 <泛型变量> 返回值类型 方法名称(形参列表){

        }
        注意：方法定义了是什么泛型变量，后面就只能用什么泛型变量。
        泛型类的核心思想：是把出现泛型变量的地方全部替换成传输的真实数据类型。

        需求：给你任何一个类型的数组，都能返回它的内容。

        小结：
        泛型方法和泛型类可以做通用技术架构。

        注：泛型方法可以声明为静态的。原因：泛型参数是在调用方法时确定的，并非在实例化时确定。
        */
    public static void main(String[] args) {
        String[] s = new String[]{"yang", "9oaaf", "89ef"};
        System.out.println(arrToString(s));

        Integer[] in = {11, 33, 22, -99};
        System.out.println(arrToString(in));
    }

    private static <T> String arrToString(T[] objs) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        if (objs != null && objs.length > 0) {
            for (int i = 0; i < objs.length; i++) {
                sb.append(i == objs.length - 1 ? objs[i] : objs[i] + ", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
