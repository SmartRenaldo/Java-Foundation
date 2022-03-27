package Quick;

import Merge.MergeSortHard;

import java.util.Arrays;

public class TestHard {
    public static void main(String[] args) {
        String[] str = {"AAA","TTT","eeeeee","kkkkk"};
        //"AAA","TTT","eeeeee","kkkkk"
        //"AAA","eeeeee","kkkkk","TTT"
        new QuickSortHard().sort(str);
        System.out.println(Arrays.toString(str));
    }
}
