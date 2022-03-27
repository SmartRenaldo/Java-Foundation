package Select;

public class Select2 {
    public void sort(int[] array) {
        //one by one move boundary of unsorted subarray
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            //find the minimum element in unsorted part
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            //put the smallest element into sorted part.
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }

    public int[] sortWithIndex(int[] array) {
        //create indices array
        int[] indices = new int[array.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        //one by one move boundary of unsorted subarray
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            // Find the minimum element in unsorted part
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            //put the smallest element into sorted part.
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
            int tmpIndex = indices[i];
            indices[i] = indices[minIndex];
            indices[minIndex] = tmpIndex;
        }
        return indices;
    }

    public void sort(String[] array) {
        //one by one move boundary of unsorted subarray
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            //find the minimum element in unsorted part
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            //put the smallest element into sorted part.
            String tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
        }
    }

    public int[] sortWithIndex(String[] array) {
        //create indices array
        int[] indices = new int[array.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        //one by one move boundary of unsorted subarray
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            //find the minimum element in unsorted part
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            //put the smallest element into sorted part.
            String tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;
            int tmpIndex = indices[i];
            indices[i] = indices[minIndex];
            indices[minIndex] = tmpIndex;
        }
        return indices;
    }
}
