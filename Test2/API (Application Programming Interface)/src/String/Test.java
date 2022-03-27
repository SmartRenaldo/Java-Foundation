package String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr={134,24,-13,35,19,91,-14};
        Arrays.sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();

        String[] strings = new String[]{"a3a", "894", "-iqef", "QREF", "-922"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
