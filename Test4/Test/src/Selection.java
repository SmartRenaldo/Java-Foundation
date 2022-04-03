/*
 *   Foundations of Computer Science
 *   2018, Semester 01
 *   Practical-Exam-04
 *
 *   student (id): a111111
 *   student (name): John Smitth
 *
 * Note: in order to finish your exam you need to make changes in this class
 * Problem 03
 */
public class Selection extends Sort {
/*
	@Override
	public int [] sortIntByIndex(int [] arr){
		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;
			while( j >= 0 && arr[j] > key){
				if(arr[j] > key){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}
		return index;
	}
*/


    @Override
    public int[] sortIntByIndex(int[] arr) {
        int[] index = this.getIndex(arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Put the smallest element into sorted part.
            int tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
            int tmpIndex = index[i];
            index[i] = index[min_idx];
            index[min_idx] = tmpIndex;
        }
        return index;
    }

    @Override
    public int[] sortInt(int[] arr) {
        int[] index = this.getIndex(arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            // Put the smallest element into sorted part.
            int tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
            int tmpIndex = index[i];
            index[i] = index[min_idx];
            index[min_idx] = tmpIndex;
        }
        return arr;
    }


    @Override
    public int[] sortStringByIndex(String[] arr) {
        int[] index = this.getIndex(arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            // Put the smallest element into sorted part.
            String tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
            int tmpIndex = index[i];
            index[i] = index[min_idx];
            index[min_idx] = tmpIndex;
        }
        return index;
    }

    @Override
    public String[] sortString(String[] arr) {
        int[] index = this.getIndex(arr.length);
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min_idx]) < 0) {
                    min_idx = j;
                }
            }
            // Put the smallest element into sorted part.
            String tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
            int tmpIndex = index[i];
            index[i] = index[min_idx];
            index[min_idx] = tmpIndex;
        }
        return arr;
    }
}
