package Demo1;

public interface InterfaceAbstract {
    /*
        注意事项：

        1.接口当中的抽象方法，修饰符必须是两个固定关键词：public abstract

        2.这两个关键字修饰符，可以选择性省略(今天新学，所以不省)。

        3.方法三要素(方法名、参数列表、返回值)，可以根据需求，随意定义。
    */

    /*
    【接口的使用步骤】：
    1、接口不能直接使用（复习，抽象类也不能直接使用），必须是一个[实现类]来“实现”该接口，关键字：implements
    实现类格式：
    public class 实现类名称 implements 接口名称{
        ...
    }

    2、接口的实现类必须覆盖重写（实现）接口中所有的抽象方法（注意：如果没有全部重写，实现类自身必须是抽象类）
    覆盖重写（实现）格式：去掉abstract关键字，补全方法体大括号

    3、创建实现类的对象，通过对象来使用接口
    */

    public abstract void methodAbs1();
    public void methodAbs2();       //This is also an abstract method
    abstract void methodAbs3();       //This is also a public method
    void methodAbs4();       //This is also a public abstract method
}
