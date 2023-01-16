package Interfaces;

public class Cat implements Pet{

    private String name;
    private Integer age;

    //declaring a variable from the interface
    Animal mN;
    public Cat (String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //using the Animal variable above
    public void makeNoiseFrom() {
        mN.makeNoise();
    }

    @Override
    public void introduce(String name, int age) {
        System.out.println("I'm an " + Animal.name + " from the Animal interface");
        System.out.println("and I also have attributes from the " + Pet.pet + " interface!");
        System.out.println("My name is " + name + " and my age is " + age);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!");
    }

    public void scratch() {
        System.out.println("scratched...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
