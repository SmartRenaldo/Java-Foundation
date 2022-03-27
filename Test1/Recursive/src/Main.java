import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println(nextHappyNum(8));
        System.out.println(nextHappyNum(3));
        System.out.println(nextHappyNum(0));
        System.out.println(nextHappyNum(10));
        System.out.println(decodeString("3[b2[ca]1[d]]"));
    }

    static String src;
    static int ptr;

    private static String decodeString(String s) {
        src = s;
        ptr = 0;//pointer
        return getString();//call recursive method
    }

    private static String getString() {
        if (ptr == src.length() || src.charAt(ptr) == ']') {
            return "";
        }

        char cur = src.charAt(ptr);
        int count = 1;
        StringBuilder ret = new StringBuilder();

        if (Character.isDigit(cur)) {
            // parse number
            count = getDigits();
            // filter '['
            ++ptr;
            // parse String
            // recursive between '[' and ']'
            String str = getString();
            // filter ']'
            ++ptr;
            //splice
            while (count-- > 0) {
                //splice
                ret.append(str);
            }
        } else if (Character.isLetter(cur)) {
            // parse char
            ret = new StringBuilder(String.valueOf(src.charAt(ptr++)));
        }

        return ret + getString();
    }

    //parse digit

    /**
     * @return ret processed digits
     */
    private static int getDigits() {
        int ret = 0;
        while (ptr < src.length() && Character.isDigit(src.charAt(ptr))) {
            ret = ret * 10 + src.charAt(ptr++) - '0';
        }
        return ret;
    }

    /**
     * @param num an integer
     * @return the next smallest happy number
     */
    private static int nextHappyNum(int num) {
        //must be the next happy number
        return realNextHappyNum(num + 1);
    }

    private static int realNextHappyNum(int num) {
        //if num != 1, --> iterate the method extHappyNum(int numStored +1)
        final int NUM = num;
        if (num == 1) {
            return 1;
        }

        Set<Integer> integers = new HashSet<>();
        //no new number is created
        while (integers.add(num)) {
            int value = 0;
            while (num > 0) {
                value += Math.pow(num % 10, 2);
                num /= 10;
            }
            num = value;
        }
        if (num != 1) {
            return realNextHappyNum(NUM + 1);
        }
        return NUM;
    }
}
