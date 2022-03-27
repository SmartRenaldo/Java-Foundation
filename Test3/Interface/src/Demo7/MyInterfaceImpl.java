package Demo7;

public class MyInterfaceImpl extends Father implements MyInterfaceA, MyInterfaceB{
    @Override
    public void methodA() {
        System.out.println("Override method A");
    }

    @Override
    public void methodB() {
        System.out.println("Override method B");
    }

    @Override
    public void methodABS() {
        System.out.println("Override method ABS");
    }

    @Override
    public void methodDefault() {
        System.out.println("Override");
    }

}
