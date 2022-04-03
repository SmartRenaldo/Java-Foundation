import java.util.ArrayList;

public class Wildcard {
    /*
        目标：泛型通配符。

        需求：开发一个极品飞车的游戏，所有的汽车都能一起参与比赛。

        注意：
        虽然BMW和BENZ都继承了Car
        但是ArrayList<BMW>和ArrayList<BENZ>与ArrayList<Car>没有关系的！泛型没有继承关系！

        通配符：？
                ?可以用在使用泛型的时候代表一切类型。
        E , T , K , V是在定义泛型的时候使用代表一切类型。

        泛型的上下限：
                ? extends Car : 那么?必须是Car或者其子类。(泛型的上限)
                ? super  Car :那么?必须是Car或者其父类。（泛型的下限。不是很常见）
        小结：
        通配符：?可以用在使用泛型的时候代表一切类型。
                ? extends Car : 那么?必须是Car或者其子类。(泛型的上限)
                */
    public static void main(String[] args) {
        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        run(benzs);

        ArrayList<BMW> bmw = new ArrayList<>();
        bmw.add(new BMW());
        bmw.add(new BMW());
        bmw.add(new BMW());
        run(bmw);

        ArrayList<Pig> pigs = new ArrayList<>();
        pigs.add(new Pig());
        pigs.add(new Pig());
        pigs.add(new Pig());
        //run(pigs);    报错
    }

    public static void run(ArrayList<? extends Car> arrayList){

    }
}

class Car {
}

class BMW extends Car {
}

class BENZ extends Car {
}

class Pig{}