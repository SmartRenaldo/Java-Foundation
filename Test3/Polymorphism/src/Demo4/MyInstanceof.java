package Demo4;

public class MyInstanceof {
/*
    判断父类引用的对象是什么子类
    格式：
    对象 instanceof 类名称；
    这将会得到一个boolean值结果，也就是判断前面的对象能不能当作后面类型的实例。
*/
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        girlfriend(animal);
    }

    private static void girlfriend(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.house();
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
