package Quick;

import java.util.Arrays;

public class TestIndex {
    public static void main(String[] args) {
        String[] array = {"aaa", "kkk", "AAA", "PPP", "bbb"};
        int[] indices = new QueckSoriWithIndex().sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(indices));

        String[] array2 = {"aaa", "kkk", "AAA", "PPP", "bbb"};
        new QuickSortHard().sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
