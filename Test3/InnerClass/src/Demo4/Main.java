package Demo4;

/*
七、匿名内部类

        如果接口的实现类或者是父类的子类只需要使用唯一的一次，
        那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】

        匿名内部类的定义格式
        接口名称 对象名=new 接口名称（）{
        //覆盖重写接口中所有抽象方法
        }；//没有名字的类
*/
public class Main {
    public static void main(String[] args) {
/*
        Interface obj = new InterfaceImpl();
        obj.method();
*/
        Interface one = new Interface() {
            @Override
            public void method() {
                System.out.println("Anonymous inner class");
            }
        };
        one.method();

        new Interface() {
            @Override
            public void method() {
                System.out.println("Anonymous inner class and object");
            }
        }.method();
    }
}
