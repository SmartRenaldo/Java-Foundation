package stringBuilder;

public class Demo2 {
    public static void main(String[] args) {
        time(40000);
    }

    private static void time(int a) {       //a: maximum number
        long start = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            s.append(i);
        }
        System.out.println(s);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
