package Demo1;

public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person("One");
        System.out.println(p1.getName());
        System.out.println(p1);
        p1 = new Person("Two");
        System.out.println(p1.getName());
        System.out.println(p1);

        final Person p2 = new Person("Black");
        System.out.println(p2.getName());
        System.out.println(p2);
        //错误写法:     p2 = new Person("White");
        //该写法会为p2创建新地址
        p2.setName("White");
        System.out.println(p2.getName());
        System.out.println(p2);
    }
}
