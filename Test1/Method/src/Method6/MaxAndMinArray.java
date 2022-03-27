package Method6;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] arr = {11, 11, 11, 11, 11, 11, 11};
        int[] maxAndMinArray = getMaxAndMin(arr);
        System.out.println("Min = " + maxAndMinArray[0]);
        System.out.println("Max = " + maxAndMinArray[1]);
    }

    public static int[] getMaxAndMin(int[] arr) {
        //Determine whether there is a maximum and minimum
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[0] != arr[i]) {
                flag = true;
                break;
            }
        }

        if (flag) {
            int max = arr[0];
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                } else if (min > arr[i]) {
                    min = arr[i];
                }
            }
            return new int[]{min, max};
        } else {
            System.out.println("Error! There is no maximum and minimum! Program exit!");
            System.exit(1);
            return null;
        }
    }
}