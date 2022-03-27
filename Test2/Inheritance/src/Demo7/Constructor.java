package Demo7;

public class Constructor {
    /*
        继承关系中的父子类构造方法的特点：
                1.子类构造方法当中有一个默认隐含的 “super()” 调用，所以一定先调用的父类构造方法，后执行的子类构造方法

                2.可通过 super 关键字调用父类重载构造（默认的是无参构造）

                super（100）

                3.super 的父类构造调用，必须是子类构造方法的第一个语句，一个子类构造不可多次调用
    */
    public static void main(String[] args) {
        Son son = new Son();
    }
}
