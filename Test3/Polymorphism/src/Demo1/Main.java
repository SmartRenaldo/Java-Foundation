package Demo1;

public class Main {
    public static void main(String[] args) {
        Parent child = new Child();
        child.method();
        child.methodParent();
        System.out.println(child.age);
    }
}
