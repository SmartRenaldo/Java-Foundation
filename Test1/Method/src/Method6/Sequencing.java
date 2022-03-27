package Method6;

public class Sequencing {
    public static void main(String[] args) {
        int[] list = {5, 3, 6, 2, 1, 8, 4, 7};
        sort(list);

        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public static void sort(int[] arr) {
        //外层循环控制比较的次数  arr[arr.leng-1]后面没有比较的数据 比较数[0,arr.leng-1-1]
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环控制到达位置   被比较数据[1,arr.leng-1-i(已经比较过的次数)]
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
