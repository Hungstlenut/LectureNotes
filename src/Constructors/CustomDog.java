package Constructors;

public class CustomDog {
    String name;
    int age;

    //this is a custom constructor, which has the same name as the class
    public CustomDog(){
        this.name = "Inu";
        this.age = 2;
    }
    //this also a custom constructor, but this one has parameters and we are now using "method overloading".
    public CustomDog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //since we will be printing out methods later,
    //we need to make Java print out what we want.
    //Instead of a place in memory.
    public String toString(){
        return this.name + ", " + this.age + " years old";
    }

}
