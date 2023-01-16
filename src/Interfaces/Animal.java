package Interfaces;

public interface Animal {
    /**
     * Not UI/UX
     * An interface's signature:
     * - A contract
     * - Any class that implements an interface must provide an implementation for these methods
     * - A class can implement multiple interfaces
     * - An interface's attributes are public, static and final.
     * - Class implements 1:M interface. Does not extend.
     * A good place to put JavaDoc.
     * You can write UnitTests against an interface
     * Abstract classes may contain non-final variables, whereas variables in the interface are final, public and static
     */
    /*
    Example:
    interface IPet

    public void eat();

    class Dog extends Mammal implements IPet

    class Dog extends Mammal implements IPet

    class Fish implements IPet

    -----------------------------------------
    Constructing a new object:
    Dog d = new Dog();
    This is essentially written: variable type d = new object type;
    Where the variable type decides what d can do (what methods we can call on variable d),
    while the new object type will do it.

    That means that we can write it like this too:
    Ipet d = new Dog();
    or even:
    Mammal d = new Dog();
    or:
    IPet d = new Cat();

    This makes the coding "loosely" coupled, which makes it flexible!

     */

    String name = "Animal";
    int age = 0;

    void makeNoise();
    void introduce(String name, int age);
}
