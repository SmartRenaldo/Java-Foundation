package stringBuilder;

public class Demo6_Reverse_Length {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("qwerty");
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.toString());      //返回此序列中数据的字符串表示形式
        System.out.println("The number of characters in sb is: " + sb.length());
    }
}