public class Demo1 {
    /*    目标：包装类的使用
        引入：

                 Java认为一切皆对象。
                 但是Java中的8种基本数据类型，并不是对象，而是数据的一种形式。
                 Java为了实现一切皆对象，把8种数据类型都设计了一种对应的类，这个类就是包装类。

                    基本数据类型 	    包装类
                    byte 	        Byte
                    short 	        Short
                    int 	        Integer(特殊)
                    long 	        Long
                    float 	        Float
                    double 	        Double
                    char 	        Character(特殊)
                    boolean 	    Boolean
        自动装箱：

                 可以直接把基本数据类型的变量或者值直接赋值给对应的包装类变变量成为一个对象。
        自动拆箱：

                 可以直接把包装类的变量赋值给基本数据类型的变量。
        小结：

                 Java通过了包装类实现了一切皆对象。*/
    public static void main(String[] args) {
        int a = 8;
        Integer a2 = 8;     //自动装箱
        Integer a3 = a;     //自动装箱

        double b = 99.9;
        Double b2 = 99.9;   //自动装箱
        Double b3 = b;      //自动装箱

        Boolean c = true;
        boolean c2 = c;     //自动拆箱

        char d = 'a';
        Character d2 = null;    //引用数据类型的值可以为null

        Integer it = Integer.valueOf(12);    // 手工装箱（不建议）

        Integer itt = 12;
        int ittt = itt.intValue();// 手工拆箱（不建议）
    }
}
