package Select;

public class Select extends AbstractSort{
    @Override
    public void sort(int[] array, boolean descending) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            // Find the smallest element from the unsorted part.
            for (int j = i+1; j < n; j++) {
                if (this.compareInt(array[j], array[min_idx], descending) == -1) {
                    min_idx = j;
                }
            }
            // Put the smallest element into sorted part.
            this.swap(array, i, min_idx);
        }
    }
}
