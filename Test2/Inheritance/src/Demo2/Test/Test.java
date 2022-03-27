package Demo2.Test;

import Demo2.Domain.Father;
import Demo2.Domain.Son;

public class Test {
    /*
        在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，访问有两种方式：

        直接通过子类对象访问成员变量： 等号左边是谁，就优先用谁，没有则向上找。
        间接通过成员方法访问成员变量： 该方法属于谁，就优先用谁，没有则向上找。
    */
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.numFather);// 只能使用父类的东西，没有任何子类内容
        System.out.println("-----------------------");

        Father person = new Son();
        System.out.println(person.num);

        Son son = new Son();
        System.out.println(son.numFather);
        System.out.println(son.numSon);
        System.out.println("-----------------------");

        System.out.println(son.num);        //优先子类，200   "Son son = new Son()"等號左邊是Son
        System.out.println(father.num);
        System.out.println("-----------------------");

        son.methodSon();        //这个方法是子类的，优先用子类的，没有再向上找
        father.methodFather();
    }
}
