package Task10;
/*
- Hashset

- Passing objects as parameters
- Testing constructor methods
 */
import java.util.HashSet;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        //using the custom constructor that has to pass in 2 parameters!
        Person person1 = new Person("Atle Antonsen", 20);
        //this method takes in only methods from Person class as specified below.
        //Passing in an object means also that you pass in the WHOLE class of that object.
        Program add1 = new Program(person1);

        //making a new person/object using the default constructor and passing it into Program.
        Person person2 = new Person();
        person2.setName("Rudolf");
        person2.setAge(30);

        Program add2 = new Program(person2);

        //adding another person using the method in Program instead of the constructor
        Person person3 = new Person("Levi", 25);

        Program add3 = new Program();
        //had to make an own method, because the others were constructors...
        add3.addPerson(person3);

        //lets check duplicates
        Person person4 = new Person("Atle Antonsen", 20);
        Program add4 = new Program(person4);

    }
}

class Program {
    //this parameter is of the type class Person, that means I HAVE to use an object that comes
    //from this class.
    HashSet<Person> p = new HashSet<>();

    public Program(Person nameAndAge){
        p.add(nameAndAge);

        System.out.println(p);
    }
    public Program(){
        System.out.println("I'm a default constructor!");
    }

    public void addPerson(Person person){
        p.add(person);
        System.out.println(p);
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

    public Person (){
        System.out.println("Name is " + getName() + ", age is" + getAge());
    }

    public Person (String name, int age){
        this.name = name;
        this.age = age;

    }

    public String toString(){
        return "Name: " + name + ", hash:" + this.name.hashCode() + "\n age:" + age;
    }

}

