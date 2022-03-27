package Object3;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Lucas";
        Student s2 = s1;
        s2.name = "Lucy";
        System.out.printf("%s----%s\n", s1.name, s2.name);
        s1 = null;
        System.out.println(s1);
        //System.out.println(s1.name);      -->NullPointerException
        System.out.println(s2.name);
        s2 = null;
    }
}
