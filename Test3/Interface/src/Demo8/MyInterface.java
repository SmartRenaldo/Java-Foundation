package Demo8;

public interface MyInterface extends MyInterfaceA, MyInterfaceB {
/*
    接口之间的多继承
        1、类与类之间是单继承的。直接父类只有一个。
        2、类与接口之间是多实现的。一个类可以实现多个接口。
        3、接口与接口之间是多继承的。
    注意事项：
        1、多个父接口当中的抽象方法如果重复，没关系。（抽象方法没有方法体）
        2、多个父接口当中的默认方法如果重复，那么子接口必须进行默认方法的覆盖重写，而且带着default关键字。（默认方法有方法体）
*/

    @Override
    default void methodDefault() {
        System.out.println("Oberride default method");
    }
}
