package Demo1;

public class Main {
    public static void main(String[] args) {
        //      InterfaceAbstract interfaceAbstract = new InterfaceAbstract()       错误写法
        InterfaceAbstractImpl impl = new InterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();
    }
}
