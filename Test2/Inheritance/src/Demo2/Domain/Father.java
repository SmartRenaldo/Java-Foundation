package Demo2.Domain;

public class Father {
    static {
        System.out.println("Static Father");
    }
    public int numFather = 10;
    public int num = 100;

    public void methodFather() {
        System.out.println(num);
    }
}
