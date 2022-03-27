package Bubble;

public class Bubble2 {
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // check if anything was changed
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    //swap array[j] and array[j+1]
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    swapped = true;
                }
            }

            // nothing changed -> already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public int[] sortWithIndex(int[] array) {
        //create indices array
        int[] indices = new int[array.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        for (int i = 0; i < array.length - 1; i++) {
            // check if anything was changed
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    //swap array[j] and array[j+1]
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    //swap indices[j] and indices[j+1]
                    int tmpIndex = indices[j+1];
                    indices[j+1] = indices[j];
                    indices[j] = tmpIndex;
                    swapped = true;
                }
            }

            // nothing changed -> already sorted
            if (!swapped) {
                break;
            }
        }
        return indices;
    }

    public void sort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // check if anything was changed
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    //swap array[j] and array[j+1]
                    String tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    swapped = true;
                }
            }

            // nothing changed -> already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public int[] sortWithIndex(String[] array) {
        //create indices array
        int[] indices = new int[array.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        for (int i = 0; i < array.length - 1; i++) {
            // check if anything was changed
            boolean swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) {
                    //swap array[j] and array[j+1]
                    String tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    //swap indices[j] and indices[j+1]
                    int tmpIndex = indices[j+1];
                    indices[j+1] = indices[j];
                    indices[j] = tmpIndex;
                    swapped = true;
                }
            }

            // nothing changed -> already sorted
            if (!swapped) {
                break;
            }
        }
        return indices;
    }

}
