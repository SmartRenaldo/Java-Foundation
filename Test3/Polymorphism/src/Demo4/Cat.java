package Demo4;

public class Cat extends Animal {
    public void catchMouse() {
        System.out.println("Catch ya");
    }

    @Override
    public void eat() {
        System.out.println("Eat ya");
    }
}
