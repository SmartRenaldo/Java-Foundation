import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        String s = "r13y89uTS";
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
