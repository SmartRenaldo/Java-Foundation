package Laptop;

public class Keyboard implements USB{
    @Override
    public void open() {
        System.out.println("Open keyboard");
    }

    @Override
    public void close() {
        System.out.println("Close keyboard");
    }

    public void type(){
        System.out.println("Typing keyboard");
    }
}
