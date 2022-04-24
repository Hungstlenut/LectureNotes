package Task10;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Program p = new Program();
    }
}

class Program {

    public Program(String name, int age){
        name =
        HashSet<String> n = new HashSet<>();

    }

}

class Person {
    private int age;
    private String name;


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Name: " + name + "\n age:" + age;
    }

}

