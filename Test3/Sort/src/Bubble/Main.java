package Bubble;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {12, 9, 5, 24, 3};
        Bubble bubble = new Bubble();
        bubble.sort(array, false);
        bubble.printArray(array);
        int[] array2 = {12, 9, 5, 24, 3};
        new Bubble2().sort(array2);
        System.out.println(Arrays.toString(array2));
        int[] array3 = {12, 9, 5, 24, 3};
        int[] indexArray = new Bubble2().sortWithIndex(array3);
        System.out.println(Arrays.toString(indexArray));
        String[] array4 = {"aaa","kkk","AAA","PPP","bbb"};
        new Bubble2().sort(array4);
        System.out.println(Arrays.toString(array4));
        String[] array5 = {"aaa","kkk","AAA","PPP","bbb"};
        int[] indexArray2 = new Bubble2().sortWithIndex(array5);
        System.out.println(Arrays.toString(indexArray2));
    }
}
