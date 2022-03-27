package Quick;

public class QueckSoriWithIndex {
    public int[] sort(String[] array) {
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
    private void sortRec(String[] array, int[] indices, int start, int end) {
        if (start < end) {
            // Reorder an array to [< pivot, pivot, >= pivot] and return an index of pivot position
            int pivotIndex = partition(array, indices, start, end);

            // Call sort recursively for left and right parts
            this.sortRec(array, indices, start, pivotIndex - 1);
            this.sortRec(array, indices, pivotIndex + 1, end);
        }
    }

    // Reorder an array to [< pivot, pivot, > pivot] and return an index of pivot position
    private int partition(String[] array, int[] indices, int start, int end) {
        // Choose last element as pivot
        String pivot = array[end];
        int pivotIndex = indices[end];

        // Swap all element that are smaller than pivot to the left part
        int i = start; // index of current "free" space in the left part
        for (int j = start; j < end; j++) {
            // If current element is smaller than the pivot
            if (array[j].compareTo(pivot) < 0) {
                // Put this element in the left part
                String tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                int tmpIndex = indices[i];
                indices[i] = indices[j];
                indices[j] = tmpIndex;

                // Position i is already occupied with smaller element -> increment
                i++;
            }
        }

        // Put pivot at its place (after the smaller part)
        String tmp = array[i];
        array[i] = array[end];
        array[end] = tmp;
        int tmpIndex = indices[i];
        indices[i] = indices[end];
        indices[end] = tmpIndex;

        return i;
    }
}
