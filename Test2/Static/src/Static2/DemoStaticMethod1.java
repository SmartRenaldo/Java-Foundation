package Static2;

import Domain.MyClass;

public class DemoStaticMethod1 {
    /*
        一旦使用static修饰成员方法，那么这就成为了静态方法。静态方法不属于对象，而是属于类的。
        如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
        注意：静态只能直接访问静态。【原因】：内存中先有的静态内容，后有的非静态内容
        无论是变量还是方法，只要有了static修饰，推荐用类名称进行调用
    */
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method(); //首先创建对象
        //然后才能使用没有static关键字的内容

        //对于静态方法来说，可以通过对象调用，也可以通过类调用
        obj.methodClass();//正确，不推荐
        MyClass.methodClass();//正确，推荐

        //对于Class当中的静态方法，可以省略类名称
        MyMethod();
        DemoStaticMethod1.MyMethod();//与MyMethod();完全等效
    }

    public static void MyMethod(){
        System.out.println("Own method");
    }
}
