package day13.inheritance2;

import day13.inheritance2.Animal.Cat;
import day13.inheritance2.Animal.Dog;

public class AnimalMain {
    public static void main(String[] args) {
        Cat objCat = new Cat();
        objCat.meow();
        objCat.eat();

        Dog objDog = new Dog();
        objDog.bark();
        objDog.eat();
    }
}
