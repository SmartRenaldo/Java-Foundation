package Demo5;

public interface InterfacePrivateStatic {
    public static void methodA() {
        System.out.println("Method A");
        methodCommon();
    }

    public static void methodB() {
        System.out.println("Method B");
        methodCommon();
    }

    private static void methodCommon() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
