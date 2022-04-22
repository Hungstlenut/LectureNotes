package Constructors;

public class DefaultConstructor {
    public static void main(String[] args) {
        //Since the Dog class does not use any parameters, Java makes a default constructor
        Dog doggy = new Dog();

        System.out.println(doggy.name);
    }

}
