package Test2;

public class TestThis {
    public int a, b;

    TestThis() {
        this.a = 1;
        this.b = 1;
    }

    TestThis(int a) {
        this();
        this.a = a;
    }

    TestThis(int a, int b) {
        this(a);
        this.b = b;
    }

    public void display() {
        System.out.println("a: " + a + "\n" + "b: " + b);
    }
}
