package Demo4;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
