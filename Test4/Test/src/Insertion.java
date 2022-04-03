/*
 *   Foundations of Computer Science
 *   2018, Semester 01
 *   Practical-Exam-04
 *
 *   student (id): a111111
 *   student (name): John Smitth
 *
 * Note: in order to finish your exam you need to make changes in this class.
 * Note that you have to implemented lines from 57 - 67
 *
 */
public class Insertion extends Sort {

    @Override
    public int[] sortIntByIndex(int[] arr) {
        int[] index = this.getIndex(arr.length);

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int keyIndex = index[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    index[j + 1] = index[j];
                    j--;
                }
            }
            arr[j + 1] = key;
            index[j + 1] = keyIndex;
        }

        return index;
    }

    @Override
    public int[] sortInt(int[] arr) {
        int[] index = this.getIndex(arr.length);

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int keyIndex = index[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    index[j + 1] = index[j];
                    j--;
                }
            }
            arr[j + 1] = key;
            index[j + 1] = keyIndex;
        }

        return arr;
    }

    @Override
    public int[] sortStringByIndex(String[] arr) {
        int[] indexArray = this.getIndex(arr.length);
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            int keyIndex = indexArray[i];
            int j = i - 1;
            while ((j > -1) && (arr[j].compareTo(key) > 0)) {
                arr[j + 1] = arr[j];
                indexArray[j + 1] = indexArray[j];
                j--;
            }
            arr[j + 1] = key;
            indexArray[j + 1] = keyIndex;
        }

        return indexArray;
    }

    @Override
    public String[] sortString(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while ((j > -1) && (arr[j].compareTo(key) > 0)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        return arr;
    }


}