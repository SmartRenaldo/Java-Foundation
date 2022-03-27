import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33};
        int[] arr2 = {44, 55, 66};
        int[][] arr = {{11, 22, 33}, {44, 55, 66}};
        System.out.println(Arrays.deepToString(arr));
        int[][] array = {arr1, arr2};
        System.out.println(Arrays.deepToString(array));
    }
}
