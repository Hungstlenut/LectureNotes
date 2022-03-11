package Step8;
/*
In this step, we are going through Is-a vs Has-a relationships.
This is a "Is-a" relationship between chef and person.
 */

public class Chef extends Person {
    public static void main(String[] args) {
        Chef chef = new Chef();
        System.out.println(chef.speak());
    }
}
