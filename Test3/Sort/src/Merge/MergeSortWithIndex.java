package Merge;

public class MergeSortWithIndex {
    public int[] sort(int[] array) {
        //create indices array
        int[] indices = new int[array.length];
        for (int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // Calling recursive sort for the whole array
        this.sortRec(array, indices, 0, array.length - 1);

        return indices;
    }

    // Sort an array recursively
    private void sortRec(int[] array, int[] indices, int start, int end) {
        if (start < end) {
            // Find the middle index
            int middle = (start + end) / 2;

            // Call sort recursively for left part
            this.sortRec(array, indices, start, middle);
            // Call sort recursively for right part
            this.sortRec(array, indices, middle + 1, end);

            // Merge two sorted parts
            this.merge(array, indices, start, middle, end);
        }
    }

    // Merge two sorted subarrays
    private void merge(int[] array, int[] indices, int start, int middle, int end) {
        // Lengths of subarrays
        int n1 = middle - start + 1; // left part
        int n2 = end - middle; // right part

        // Copy two parts into tmp arrays
        int[] left = new int[n1];
        int[] right = new int[n2];
        System.arraycopy(array, start, left, 0, n1);
        System.arraycopy(array, middle + 1, right, 0, n2);

        int[] leftIndices = new int[n1];
        int[] rightIndices = new int[n2];
        System.arraycopy(indices, start, leftIndices, 0, n1);
        System.arraycopy(indices, middle + 1, rightIndices, 0, n2);

        // Merge elements
        int i1 = 0, i2 = 0, j = start;

        // While both arrays still have elements to compare
        while (i1 < n1 && i2 < n2) {
            if (left[i1] < right[i2]) {
                array[j] = left[i1];
                indices[j] = leftIndices[i1];
                i1++;
            } else {
                array[j] = right[i2];
                indices[j] = rightIndices[i2];
                i2++;
            }
            j++;
        }

        // Add all elements that left in any array
        while (i1 < n1) {
            array[j] = left[i1];
            indices[j] = leftIndices[i1];
            j++;
            i1++;
        }

        while (i2 < n2) {
            array[j] = right[i2];
            indices[j] = rightIndices[i2];
            j++;
            i2++;
        }
    }
}
