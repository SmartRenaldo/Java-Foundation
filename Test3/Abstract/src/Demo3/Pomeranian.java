package Demo3;

public class Pomeranian extends Dog{
    public Pomeranian() {
        System.out.println("I am a pomeranian");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep of pomeranian");
    }
}
