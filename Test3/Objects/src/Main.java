import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student s1 = null;
        Student s2 = new Student();
        System.out.println(Objects.equals(s1,s2));      //avoid nullPointerException. Recommend!!!!!!!!!
        //System.out.println(s1.equals(s2));
    }
}