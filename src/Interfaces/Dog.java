package Interfaces;

public class Dog implements Animal{

    @Override
    public void makeNoise() {
        System.out.println("Woof!");
    }
}
