package Domain;

public class StaticBlock {
    /*    静态代码块：
        静态代码块的格式是：
        public class 类名称 {
            static {
    // 静态代码块的内容
            }
        }*/
    public static void method() {
        System.out.println("Static method");
    }

    static {
        System.out.println("Static code block execution");
    }

    public StaticBlock() {
        System.out.println("Constructor execution");
    }
}
