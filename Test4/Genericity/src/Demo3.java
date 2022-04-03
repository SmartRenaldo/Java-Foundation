import java.util.ArrayList;

public class Demo3 {
    /*
    目标：自定义泛型类。

    引入：
        我们之前用的泛型都是别人写好的，接下来我们来自定义泛型类使用。

    泛型类的概念：
        使用了泛型定义的类就是泛型类。

    泛型类的格式：
        修饰符 class 类名<泛型变量>{

        }
        泛型变量建议使用 E , T , K , V

    需求：模拟ArrayList集合自定义一个集合MyArrayList集合。
    泛型类的核心思想：是把出现泛型变量的地方全部替换成传输的真实数据类型。

    小结：
        自定义泛型的核心思想：是把出现泛型变量的地方全部替换成传输的真实数据类型。

    注： 静态方法不能使用类的泛型
        异常类不能声明为泛型类

        T[] eles = new T[10];   编译不通过
        T[] eles = (T[]) new Object[10];    编译通过

        class MyArrayList<E>{

        }
        MyArrayList<String> lists1 = new MyArrayList<>();
        */
    public static void main(String[] args) {
        MyArrayList<Integer> myList = new MyArrayList<>();
        myList.add(18);
        myList.add(22);
        System.out.println(myList.toString());
        myList.remove(18);
        System.out.println(myList.toString());
    }

}

class MyArrayList<E>{
    private ArrayList list = new ArrayList();

    public void add(E e){
        list.add(e);
    }

    public void remove(E e){
        list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
