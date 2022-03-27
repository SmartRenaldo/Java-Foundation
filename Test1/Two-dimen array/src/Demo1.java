import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(Arrays.deepToString(arr));       //打印多维数组内容
        System.out.println("----------------------");
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        System.out.println("----------------------");
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
        System.out.println("----------------------");
        arr[0][0] = 11;
        arr[0][1] = 22;
        arr[0][2] = 33;
        arr[1][0] = 44;
        arr[1][1] = 55;
        arr[1][2] = 66;
        arr[2][0] = 77;
        arr[2][1] = 88;
        arr[2][2] = 99;
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }
}
