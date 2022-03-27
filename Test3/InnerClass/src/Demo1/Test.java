package Demo1;

public class Test {
    public static void main(String[] args) {
        Body body = new Body();
        body.drive();
        body.setName("Three");
        body.drive();
        System.out.println();

        Body.Heart heart = new Body().new Heart();
        heart.setName("Catherine");
        heart.beat();
    }
}
