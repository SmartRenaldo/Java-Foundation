package Demo9;

public class Son extends Father{
/*
    super关键字用来访问父类内容，而this关键字用来访问本类内容。
    在本类的成员方法中，访问本类的成员变量。
    在本类的成员方法中，访问本类的另一个成员方法。
    在本类的构造方法中，访问本类的另一个构造方法。
    在第三种用法当中要注意：
    A. this(…)调用也必须是构造方法的第一个语句，唯一一个。
    B. super和this两种构造调用，不能同时使用。
*/
    int num = 10;       //成员变量
    public void method(){       //成员方法
        int num = 20;       //局部变量
        System.out.println("num = " + num);
        System.out.println("this.num = " + this.num);
    }

    public void method02(){
        this.method();
        num = 30;
        System.out.println("num = " + num);
    }

    public Son() {
        System.out.println("Default constructor");
    }

    public Son(int n) {
        this();
        System.out.println("Parameterized constructor");
    }
}
