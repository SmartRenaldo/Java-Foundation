package Demo7;

public class Son extends Father{
    public Son() {
        //super(); // 在调用父类无参构造方法
        super(20); // 在调用父类重载的构造方法
        System.out.println("Son");
    }

    public void method(){
        //super();   错误写法！只有子类构造方法，才能调用父类构造方法。
    }
}
