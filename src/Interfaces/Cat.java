package Interfaces;

public class Cat implements Animal{
    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("scratched...");
    }
}
