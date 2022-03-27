package Data_exchange;

public class Data_exchange {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a ^ b;    //a = 10 ^ 20
        b = a ^ b;    //b = 10 ^ 20 ^ 20 = 10
        a = a ^ b;    //a = 10 ^ 20 ^ 10 = 20
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
