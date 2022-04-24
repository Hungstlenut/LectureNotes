package UpAndDownCasting;

public class Downcasting {
    //downcasting is the other around, but you will have to be more specific...


    public static void main(String[] args) {
        Dog dog1 = new Dog();
        moreAnimalStuff(dog1);
        //what happens if we try to cast this animal below as a cat?
        Cat cat1 = new Cat();
        moreAnimalStuff(cat1);
        //you will get an exception, because Java expected a Dog...

    }

    public static void moreAnimalStuff(Animal animal) {
        //the line below is actually then:
        //Dog dog1 = (Dog)Dog();

        //since Cat threw an exception...
        if (animal instanceof Dog) {
            Dog dog1 = (Dog) animal;
            dog1.growl();
            //here we handle the cat exception
        } else {
            System.out.println("It has to be a Dog!");
        }
    }
}