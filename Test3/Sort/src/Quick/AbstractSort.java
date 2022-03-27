package Quick;

public abstract class AbstractSort {
    // Print array
    public void print(String[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    // Sort an array
    public abstract void sort(String[] array);

    // Swap 2 elements
    public void swap(String[] array, int i, int j) {
        String tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }
}
