package Object2;

public class TestPhone {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.brand = "youPhone";
        p.price = 12999;
        System.out.println(p.brand);
        System.out.println(p.price);
        p.call("Dork");
    }
}
