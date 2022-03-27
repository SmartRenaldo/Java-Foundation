package Quick;

public class QuickSortHard extends AbstractSort {
    @Override
    public void sort(String[] array) {
        // Calling recursive sort for the whole array
        this.sortRec(array, 0, array.length - 1);
    }

    // Sort an array recursively
    private void sortRec(String[] array, int start, int end) {
        if (start < end) {
            // Reorder an array to [< pivot, pivot, >= pivot] and return an index of pivot position
            int pivotIndex = partition(array, start, end);

            // Call sort recursively for left and right parts
            this.sortRec(array, start, pivotIndex - 1);
            this.sortRec(array, pivotIndex + 1, end);
        }
    }

    // Reorder an array to [< pivot, pivot, > pivot] and return an index of pivot position
    private int partition(String[] array, int start, int end) {
        // Choose last element as pivot
        String pivot = array[end];
        //[20 8 6 12 8 10]
        //[8 20 6 12 8 10]
        //[8 6 20 12 8 10]
        //[8 6 8 12 20 10]
        //[8 6 8 10 20 12]
        //[8 6 8] 10 20 12]
        //.......
        //A:65 a:97

        // Swap all element that are smaller than pivot to the left part
        int i = start; // index of current "free" space in the left part
        for (int j = start; j < end; j++) {
            // If current element is smaller than the pivot
            if (array[j].compareTo(pivot) < 0) {
                // Put this element in the left part
                this.swap(array, i, j);

                // Position i is already occupied with smaller element -> increment
                i++;
            }
        }

        // Put pivot at its place (after the smaller part)
        this.swap(array, i, end);

        return i;
    }
}
