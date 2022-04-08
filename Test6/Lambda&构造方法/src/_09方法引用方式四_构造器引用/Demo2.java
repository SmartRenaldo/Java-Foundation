package _09方法引用方式四_构造器引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 5, 1, -6, 4);
        Integer[] integers = integerList.toArray(Integer[]::new);
        System.out.println("Arrays.toString(integers) = " + Arrays.toString(integers));

        List<Character> characterList = new ArrayList<>();
        Collections.addAll(characterList, 'f', '-', '/', '8', '男');
        Character[] characters = characterList.toArray(Character[]::new);
        System.out.println("Arrays.toString(characters) = " + Arrays.toString(characters));
    }
}
