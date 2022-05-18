package Step8;

public class Person {
    String name;
    int age;

    public String speak (){
        return "Hello world";
    }

    public Person(){

    }
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    public  String toString(){
        return "name: " + name + " age: " + age;
    }
}
