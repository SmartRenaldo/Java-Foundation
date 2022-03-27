package Merge;

import java.util.Arrays;

public class TestIndex {
    public static void main(String[] args) {
        int[] array = {11, 22, 2, 5, 1, -6};
        int[] indices = new MergeSortWithIndex().sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(indices));

        int[] array2 = {11, 22, 2, 5, 1, -6};
        new MergeSortHard().sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
