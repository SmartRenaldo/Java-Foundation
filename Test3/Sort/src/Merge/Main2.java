package Merge;

import Insert.Insert2;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] array = {11, 22, 2, 5, 1, -6};
        new Merge2().sort(array);
        System.out.println(Arrays.toString(array));

        int[] array2 = {11, 22, 2, 5, 1, -6};

        String[] array3 = {"aaa", "kkk", "AAA", "PPP", "bbb"};
        new Merge2().sort(array3);
        System.out.println(Arrays.toString(array3));
    }
}
