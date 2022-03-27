package Insert;

public class Insert2 {
    public void sort(int[] array) {
        // Loop through array elements as keys
        for (int i = 1; i < array.length; i++) {
            int key = array[i];

            // Find the position to insert key element
            // searching to the left from key
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert key element
            array[j + 1] = key;
        }
    }

    public int[] sortWithIndex(int[] array) {
        //create indices array
        int[] indices = new int[array.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // Loop through array elements as keys
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int keyIndex = indices[i];

            // Find the position to insert key element
            // searching to the left from key
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                indices[j + 1] = indices[j];
                j--;
            }

            // Insert key element
            array[j + 1] = key;
            indices[j + 1] = keyIndex;
        }
        return indices;
    }

    public void sort(String[] array) {
        // Loop through array elements as keys
        for (int i = 1; i < array.length; i++) {
            String key = array[i];

            // Find the position to insert key element
            // searching to the left from key
            int j = i - 1;
            while (j >= 0 && key.compareTo(array[j]) < 0) {
                array[j + 1] = array[j];
                j--;
            }

            // Insert key element
            array[j + 1] = key;
        }
    }

    public int[] sortWithIndex(String[] array) {
        //create indices array
        int[] indices = new int[array.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // Loop through array elements as keys
        for (int i = 1; i < array.length; i++) {
            String key = array[i];
            int keyIndex = indices[i];

            // Find the position to insert key element
            // searching to the left from key
            int j = i - 1;
            while (j >= 0 && key.compareTo(array[j])<0) {
                array[j + 1] = array[j];
                indices[j + 1] = indices[j];
                j--;
            }

            // Insert key element
            array[j + 1] = key;
            indices[j + 1] = keyIndex;
        }
        return indices;
    }
}
