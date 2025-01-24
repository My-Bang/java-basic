package day13.inheritance2;

public class Animal {
    void eat() {
        System.out.println("먹이를 먹다");
    }

    public static class Cat extends Animal {
        void meow() {
            System.out.println("야옹하고 울다");
        }
    }

    public static class Dog extends Animal {
        void bark() {
            System.out.println("멍멍하고 짖다.");
        }
    }
}
