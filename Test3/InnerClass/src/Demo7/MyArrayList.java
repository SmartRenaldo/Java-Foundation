package Demo7;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        //List是Arraylist的接口
        List<String> list = new ArrayList<>();

        List<String> strings = addName(list);
        System.out.println(list);
        System.out.println(strings);
    }

    public static List<String> addName(List<String> strList) {
        strList.add("Catherine");
        strList.add("Tiffany");
        strList.add("Janette");
        return strList;
    }
}
