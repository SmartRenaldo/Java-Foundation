package Test;

import Domain.Animal;

public class Cat extends Animal {
    @Override
    public void eat(){
        System.out.println("Eat fish");
    }
}
