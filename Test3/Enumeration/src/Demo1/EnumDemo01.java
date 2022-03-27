package Demo1;

public class EnumDemo01 {
    public static void main(String[] args) {
        Gender g1 = Gender.Boy;
        Gender g2 = Gender.Girl;
        System.out.println(g1);
        System.out.println(g1.ordinal());       //index
        System.out.println(g2);
        System.out.println(g2.ordinal());       //index
    }

    enum Gender {
        Boy, Girl;
    }
}
