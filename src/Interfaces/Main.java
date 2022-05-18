package Interfaces;

public class Main {
    public static void main(String[] args) {
        /**
         * Let's say we actually wanted to create a cat. Then we can simply remove Dog() and replace with Cat()
         * without ruining the code below. More flexibility.
         */

        Animal doggy = new Dog();
        doggy.makeNoise();
        Dog d = new Dog();

    }
}
