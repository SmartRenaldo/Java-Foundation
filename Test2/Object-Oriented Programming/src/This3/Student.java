package This3;
/*
this代表所在类的对象引动（内存地址）
        记住：方法中代表哪个对象，this就代表哪个对象
        */
public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name){
        System.out.println(this);
        this.name = name;
        System.out.println(this);
    }
}
