package Demo8;

public interface MyInterfaceA {
    public abstract void methodA();

    public default void methodDefault(){
        System.out.println("AAA");
    }
}
