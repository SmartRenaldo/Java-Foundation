package Demo3;

public class Main {
    public static void main(String[] args) {
        GoldenRetriever gr = new GoldenRetriever();
        gr.sleep();
        gr.eat();
        System.out.println("----------------------------------");

        Pomeranian pm = new Pomeranian();
        pm.sleep();
        pm.eat();
    }
}
