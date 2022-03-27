package Template1;

public class Demo1 {
    public static void main(String[] args) {
        /*
        address: setting - Editor - Live Templates / Postfix Completion
        Template1: soutv: print out variables
                   ***.sout / ***.soutv
        template2: fori
                   888.fori
         */
        int a = 88;
        int b = 99;
        System.out.println("a = " + a);

        int[] arr = {11, 66, 34, 92, 657, 1524, 24};
        for (int j : arr) {
            System.out.println(j);
        }
        for (int i1 : arr) {
            System.out.println(i1);
        }
    }
}
