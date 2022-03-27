package Demo2;

public class Main {
    public static void main(String[] args) {
        InterfaceDefaultImpl01 one = new InterfaceDefaultImpl01();
        one.methodAbs();
        one.methodDef();        //调用默认方法，如果实现类没有，会向上找接口
        System.out.println("-------------------------");

        InterfaceDefaultImpl02 two = new InterfaceDefaultImpl02();
        two.methodAbs();
        two.methodDef();
    }
}
