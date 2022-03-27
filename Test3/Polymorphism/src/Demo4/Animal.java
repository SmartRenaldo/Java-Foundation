package Demo4;
/*
对象的向下转型
        对象的向下转型，其实是一个还原的动作。
        格式：子类名称 对象名 = （子类名称）父类对象；
        含义：将父类对象，还原成为本来的子类对象。
        Animal animal = new Cat（）；//本来是毛，向上转型成为动物
        Cat cat = （Cat）animal；//本来是猫，已经被当做动物了，还原成为本来的猫。
        注意事项：
        a.必须保证对象本来创建的时候，就是猫，才能向下转型成为猫。
        b.如果对象创建的时候本来不是猫，现在非要向下转型成为猫，就会报错。
        类似于：
        int num = （int） 10.0；//可以
        int num = （int） 10.5；//不可以，精度损失
*/
public abstract class Animal {
    public abstract void eat();
}
