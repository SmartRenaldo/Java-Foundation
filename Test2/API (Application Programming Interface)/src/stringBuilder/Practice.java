package stringBuilder;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter array length:");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Please enter integer " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        String s = arrayToString(arr);
        System.out.println("The array you entered is: ");
        System.out.println(s);
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]).append("]");
                break;
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();
    }
}
