package Domain;

public class Extends01 {
    /*
    1.继承是多态的前提,如果没有继承就没有多态

    2.在继承关系中,"子类就是一个父类",也就是说,子类可以被当作父类看待

    作用:继承主要解决的问题就是共性抽取

    子类特点:

    1.子类可以拥有父类的"内容"

    2.子类还可以拥有自己专有的内容
    */
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.method01();

        Assistant assistant1 = new Assistant();
        assistant1.method01();

        Employee.method02();
    }
}
