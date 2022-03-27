package Merge;

public abstract class AbstractSort {
    // Print array
    public void print(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    // Sort an array
    public abstract void sort(int[] array);

    // Swap 2 elements
    public void swap(int[] array, int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }
}
