package Demo2.Domain;

public class Son extends Father {
    static {
        System.out.println("Static Son");
    }
    public int numSon = 20;
    public int num = 200;

    public void methodSon() {
        System.out.println(num);
    }
}
