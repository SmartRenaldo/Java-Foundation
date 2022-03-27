package Demo3;

public class Main {
    public static void main(String[] args) {
        InterfaceStatic.methodStatic();
        //注意： 应该通过接口名称进行调用，不能通过实现类对象调用接口静态方法。
        //错误写法: new ImplInterfaceStatic().methodStatic();
    }
}
