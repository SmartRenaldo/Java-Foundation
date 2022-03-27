package Demo7;

public interface MyInterfaceA {
    /*
        1、接口不能有静态代码块或者是构造方法。
        2、一个类的直接父类是唯一的，但是一个类可以同时实现多个接口。
        格式：
        public class MyInterfaceImpl implements MyInterfaceA，MyInterfaceB {
        }
        3、如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
        4、如果实现类没有覆盖重写所有接口当中的所有抽象方法，那么实现类就必须是一个抽象类。
        5、如果实现类所实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写。
        6、一个类如果直接父类当中的方法，和接口当中的默认方法产生了冲突，优先用父类当中的方法。
    */
    public abstract void methodA();

    public abstract void methodABS();

    public default void methodDefault() {
        System.out.println("AAAAA");
    }

    public default void method() {
        System.out.println("Interface");
    }
}
