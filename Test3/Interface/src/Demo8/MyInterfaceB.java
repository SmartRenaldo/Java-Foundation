package Demo8;

public interface MyInterfaceB {
    public abstract void methodB();

    public default void methodDefault(){
        System.out.println("BBB");
    }
}
