package Insert;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {11, 22, 2, 5, 1, -6};
        new Insert2().sort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {11, 22, 2, 5, 1, -6};
        int[] indexArray = new Insert2().sortWithIndex(array2);
        System.out.println(Arrays.toString(indexArray));

        String[] array3 = {"aaa", "kkk", "AAA", "PPP", "bbb"};
        new Insert2().sort(array3);
        System.out.println(Arrays.toString(array3));

        String[] array4 = {"aaa", "kkk", "AAA", "PPP", "bbb"};
        int[] indexArray2 = new Insert2().sortWithIndex(array4);
        System.out.println(Arrays.toString(indexArray2));
    }
}
