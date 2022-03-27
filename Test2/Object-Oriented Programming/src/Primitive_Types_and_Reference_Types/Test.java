package Primitive_Types_and_Reference_Types;

public class Test {
    public static void main(String[] args) {
        Plus pl = new Plus();
        Student std = new Student();
        int num = 8;
        pl.calc1(num);
        std.age = 18;
        pl.calc2(std);
        System.out.println(num);
        System.out.println(std.age);
    }
}
