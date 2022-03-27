import java.util.Arrays;

public class Demo1 {
    /*
        Java中数组属于引用类型。数组使用场合较多，对于数组的操作具有一定重复性，
        例如：数组拷贝，转换字符串，转换成数组，排序等等。
        既然重复的操作与需求多，那么对于数组操作的支持就成了JDK中的一大需求。
        java.util.Arrays中提供了很多对数组操作的支持。
    */
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        //Arrays.toString转换字符串
        String s = Arrays.toString(arr);
        System.out.println(s);

        int[] arr2 = {6, 3, 5, 8, 3, 2};
        //Arrays.sort: 数组排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        String[] arr3 = {"aaa", "rrr", "AAA", "HHH"};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
