package Demo4;
/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找。

注意事项：无论的成员方法还是成员变量，如果没有都是向上找，绝对不会向下找子类的。
 */
public class Test {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();

        father.methodFather();
        son.methodSon();

        son.method();
    }
}
