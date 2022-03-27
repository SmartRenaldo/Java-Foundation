package Enhanced_for;

public class Demo1 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        String[] arrS = {"111aaa", "22ss", "33A", "44q", "1r", "re123", "R2F354"};
        for (String s : arrS) {
            System.out.println(s);
        }
        System.out.println();

        for (String s : arrS) {
            System.out.println(s.length());
        }
        System.out.println();

        for (String s : arrS) {
            System.out.println(s.substring(0,2));       //return String
        }
        System.out.println();

        for (String s : arrS) {
            System.out.println(s.charAt(0));            //return char
        }
        System.out.println();
    }
}
