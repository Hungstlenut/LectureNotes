package Optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isEmpty());
        System.out.println(empty.isPresent());
        System.out.println("==========================================");
        Optional<String> empty2 = Optional.of("Hello");
        System.out.println(empty2.isEmpty());
        System.out.println(empty2.isPresent());
        System.out.println("==========================================");
        String orElse = empty2.orElse("world");
        System.out.println(orElse);
        System.out.println("==========================================");
        //but let's say the value is null, then you will get a nullPointerException. Therefore:
        Optional<Object> empty3 = Optional.ofNullable(null);
        //the (String) has to be specified because the line above is <Object>...
        String orElse2 = (String) empty3.orElse("world2");
        System.out.println(orElse2);
        System.out.println("==========================================");

        //in the case of nulls in the methods...
        Person person = new Person("James", null);
        System.out.println("name: " + person.getName() + " email: " + person.getEmail().orElse("email was not found!"));

    }
}

class Person {


    private final String name;

    private final String email;


    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }
    /*
    Not that this getter.
     */
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
    public String getName() {
        return name;
    }

}