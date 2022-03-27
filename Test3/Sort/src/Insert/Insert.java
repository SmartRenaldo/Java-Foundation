package Insert;

public class Insert extends AbstractSort{
    @Override
    public void sort(int[] array, boolean descending) {
        int n = array.length;
        // Loop through array elements as keys
        for (int i = 1; i < n; i++) {
            int key = array[i]; // key element

            // Find the position to insert key element
            int j = i-1; // searching to the left from key
            while (j >= 0 && this.compareInt(array[j], key, descending) == 1) {
                // Move elements to right to free space for key element
                array[j+1] = array[j];
                j--;
            }
            // Insert key element
            array[j+1] = key;
        }
    }
}
