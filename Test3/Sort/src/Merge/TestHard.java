package Merge;

import java.util.Arrays;

public class TestHard {
    public static void main(String[] args) {
        int[] arr = {11, 2};
        new MergeSortHard().sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
