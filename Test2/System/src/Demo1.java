import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Demo1 {
/*
    目标：System系统类的使用

    System代表了当前操作系统。
    System类的常用API:

    – public static long currentTimeMillis()：获取当前系统此刻时间毫秒值。
    – public static void exit(int status):终止当前正在运行的 Java 虚拟机,参数用作状态码；根据惯例，非0的状态码表示异常终止
    – public static void arraycopy(Object src, int srcPos, Object dest,
        int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
*/
    public static void main(String[] args) {
        // 1.获取当前系统此刻时间毫秒值。
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(System.currentTimeMillis()));

        // 2.终止当前JVM虚拟机。非0的状态码表示异常终止
        //System.exit(0);
        //System.exit(1);

        // 3.数组拷贝的内容。
//        int[] arrs1 = new int[]{10 , 20 , 30 , 40 ,50 ,60 ,70};
//        int[] arrs2 = new int[6]; // -> [ 0 , 0 , 40 ,50 ,60 , 0]
        int[] arr1 = new int[]{10,20,30,40,50,60,70,80};
        int[] arr2 = new int[6];
        /**
         * arraycopy(Object src,int srcPos,Object dest, int destPos,int length)
         * 参数一：原数组
         * 参数二：从原数组的哪个元素索引开始复制
         * 参数三：目标数组
         * 参数四：从目标数组的哪个位置开始粘贴
         * 参数五：复制多少个
         */
        System.arraycopy(arr1,3,arr2,2,3);
        System.out.println(Arrays.toString(arr2));
    }
}
