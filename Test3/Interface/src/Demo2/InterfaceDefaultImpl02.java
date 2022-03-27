package Demo2;

public class InterfaceDefaultImpl02 implements InterfaceDefault{
    @Override
    public void methodAbs() {
        System.out.println("The method was implemented! BBB");
    }

    @Override
    public void methodDef() {
        System.out.println("B override default method");
    }
}
