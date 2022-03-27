package Method4;

public class Compare_integer {
    public static void main(String[] args) {
        long a = 10;
        long b = 10;
        boolean c = compare(a,b);
        System.out.println(c);
    }

    public static boolean compare(int a, int b) {
        return a == b;
    }

    public static boolean compare(long a, long b) {
        return a == b;
    }

    public static boolean compare(byte a, byte b) {
        return a == b;
    }

    public static boolean compare(short a, short b) {
        return a == b;
    }
}
