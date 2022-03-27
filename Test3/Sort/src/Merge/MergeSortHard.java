package Merge;

public class MergeSortHard extends AbstractSort{
    @Override
    public void sort(int[] array) {
        // Calling recursive sort for the whole array
        this.sortRec(array, 0, array.length-1);
    }

    // Sort an array recursively
    private void sortRec(int[] array, int start, int end) {
        if (start < end) {
            // Find the middle index
            int middle = (start + end) / 2;

            // Call sort recursively for left part
            this.sortRec(array, start, middle);
            // Call sort recursively for right part
            this.sortRec(array, middle+1, end);

            // Merge two sorted parts
            this.merge(array, start, middle, end);
        }
    }

    // Merge two sorted subarrays
    private void merge(int[] array, int start, int middle, int end) {
        // Lengths of subarrays
        int n1 = middle - start + 1; // left part
        int n2 = end - middle; // right part

        // Copy two parts into tmp arrays
        int[] left = new int[n1];
        int[] right = new int[n2];
/*
        下面是 System.arrayCopy的源代码声明 :

        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        代码解释:
        　　Object src : 原数组
                int srcPos : 从元数据的起始位置开始
        　　Object dest : 目标数组
        　　int destPos : 目标数组的开始起始位置
        　　int length  : 要copy的数组的长度
        */
            System.arraycopy(array, start, left, 0, n1);
            System.arraycopy(array, middle+1, right, 0, n2);
/*
        for (int i = 0; i < n2; i++) {
            right[i] = array[middle + 1 + i];
        }
*/
/*
        for (int i = 0; i < n1; i++)
            left[i] = array[start + i];
        for (int i = 0; i < n2; i++)
            right[i] = array[middle + 1 + i];*/

        // Merge elements
        int i1 = 0, i2 = 0, j = start;

        // While both arrays still have elements to compare
        while (i1 < n1 && i2 < n2) {
            if (left[i1] < right[i2]) {
                array[j] = left[i1];
                i1++;
            } else {
                array[j] = right[i2];
                i2++;
            }
            j++;
        }

        // Add all elements that left in any array
        while (i1 < n1) {
            array[j] = left[i1];
            j++;
            i1++;
        }

        while (i2 < n2) {
            array[j] = right[i2];
            j++;
            i2++;
        }
    }
}
