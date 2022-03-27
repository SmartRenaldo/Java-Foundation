package Demo7;

public interface MyInterfaceB {
    public abstract void methodB();

    public abstract void methodABS();

    public default void methodDefault() {
        System.out.println("BBBBB");
    }
}
