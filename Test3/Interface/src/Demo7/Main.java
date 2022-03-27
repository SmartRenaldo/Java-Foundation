package Demo7;

public class Main {
    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        myInterface.method();
        myInterface.methodA();
        myInterface.methodABS();
        myInterface.methodB();
        myInterface.methodDefault();
    }
}
