package stringBuilder;

public class Demo1 {
    public static void main(String[] args) {
        time(40000);
    }

    private static void time(int a) {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 1; i <= a; i++) {
            s += i;
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
