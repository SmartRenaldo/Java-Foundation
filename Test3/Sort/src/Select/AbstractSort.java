package Select;

abstract public class AbstractSort {
    abstract void sort(int[] array, boolean descending);

    public void printArray(int[] array) {
        System.out.print("[ ");
        for (int i=0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public void swap(int[] array, int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

    public int compareInt(int a, int b, boolean descending) {
        // 0 - same; -1 - a left than b; 1 - a right than b
        if (a==b) {
            return 0;
        } else if (a < b) {
            if (descending) {
                return 1;
            } else {
                return -1;
            }
        } else {
            if (descending) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
