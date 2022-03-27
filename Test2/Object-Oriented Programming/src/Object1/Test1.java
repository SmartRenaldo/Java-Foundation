package Object1;

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println();
        s1.name="Victor";
        s1.age=22;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println();
        s1.study();
        System.out.println(s1);
        //package name + class name
    }
}
