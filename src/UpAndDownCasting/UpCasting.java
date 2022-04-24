package UpAndDownCasting;

public class UpCasting {
    public static void main(String[] args) {
        //here we create a new Dog object, but casting it to be an Animal.
        //that means that the variable myAnimal has the reference type of the Animal.
        Animal myAnimal = new Dog();

        //since Dog is the subclass of Animal, you can't access the growl method
        //so why do we need upcasting?

        //using the method below with the new Dog object above that has an
        //Animal type reference.
        //this is one way to use upcasting, so that we don't need to make a
        //separate class for each individual animal class.
        doAnimalStuff(myAnimal);

        //it will also work to just call the subclass directly as well
        //because Animal is still the superclass.
        Dog myAnimal2 = new Dog();

        doAnimalStuff(myAnimal2);

        Cat myAnimal3 = new Cat();

        doAnimalStuff(myAnimal3);


    }
        //making a method that is of type Animal but has a variable that
        //could be anything
    public static void doAnimalStuff(Animal animal) {
        animal.makeNoise();
        //remember, you can't call what doesn't exist in the Animal class...
      //animal.growl();
    }
}

