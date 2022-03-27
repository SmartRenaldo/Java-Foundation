package Domain;

public class MyClass {
    private int num;
    private static int numStatic;

    static{
        System.out.println("I am a static block");
    }

    public void method() {
        //成员方法可以访问成员变量和静态变量
        System.out.println("this.num = " + this.num);
/*
        静态变量（static 所修饰的变量），是在程序运行之前，也就是编译阶段，分配内存。
        而this关键字的意思是，当前对象的a，也就是说，必须要有对象才能用this。
        而对象的产生，必须在程序运行时，通过new产生。
        所以静态变量不能使用this关键字。
        */
        System.out.println(numStatic);
        System.out.println("这是一个成员方法");
    }

    public static void methodClass() {
        //静态方法只能访问静态变量，不能访问成员变量
        //System.out.println(num);      -->error
        System.out.println(numStatic);
        System.out.println("这是一个静态方法");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static int getNumStatic() {
        return numStatic;
    }

    public static void setNumStatic(int numStatic) {
        MyClass.numStatic = numStatic;
    }
}
