package Demo8;

public class Son extends Father{

/*
    super关键字的三种用法
    1. 在子类的成员方法中，访问父类的成员变量。
    格式：super.成员变
    2. 在子类的成员方法中，访问父类的成员方法。
    格式：super.方法名（）；
    3. 在子类的构造方法中，访问父类的构造方法
*/
    int num = 20;

    @Override
    public void method(){
        super.method();
        System.out.println("this.num = " + this.num);
        System.out.println("super.num = " + super.num);
    }

    public Son() {
        super();        //可省略
    }
}
