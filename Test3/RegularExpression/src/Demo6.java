import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo6 {
    public static void main(String[] args) {
        /*
        X? X，一次或一次也没有
        X* X，零次,一次或多次
        X+ X，一次或多次X* X
         */
        System.out.println("-------a*-------");
        Pattern pattern1 = Pattern.compile("a*");
        Matcher matcher1 = pattern1.matcher("aaaaa");
        //matcher1.matches()方法：匹配整个String语句
        //matcher1.find()方法：匹配部分String语句
        while (matcher1.find()) {
            System.out.println("找到的子字符串是: " + matcher1.group() +
                    ", 开始的下标是: " + matcher1.start() +
                    ", 结束的下标是: " + matcher1.end());
        }

        System.out.println("-------a?-------");
        Pattern pattern2 = Pattern.compile("a?");
        Matcher matcher2 = pattern2.matcher("aaaaa");
        while (matcher2.find()) {
            System.out.println("找到的子字符串是: " + matcher2.group() +
                    ", 开始的下标是: " + matcher2.start() +
                    ", 结束的下标是: " + matcher2.end());
        }

        System.out.println("-------a+-------");
        Pattern pattern3 = Pattern.compile("a+");
        Matcher matcher3 = pattern3.matcher("aaaaa");
        while (matcher3.find()) {
            System.out.println("找到的子字符串是: " + matcher3.group() +
                    ", 开始的下标是: " + matcher3.start() +
                    ", 结束的下标是: " + matcher3.end());
        }
    }
}
