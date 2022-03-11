package Step8;
/*
Here we have a "Has-a" (aggregation) relationship. Where chef is not a restaurant, but the restaurant has a chef/person.
Here we also created an instance of one class as a reference in another class, which is called an object
aggregation. In other words, an aggregation creates a "Has-a" relationship between objects.
Strings are also considered a class, so in a sense, whenever you create a String, you are creating an aggregation
relationship as well.

 */
public class Restaurant {
    public void waiter () {
        System.out.println("Hi, what can I do for you?");
    }
    public void manager () {
        System.out.println("Get back to work!");
    }
    public void chef () {
        Chef2 chef2 = new Chef2();
        System.out.println(chef2.speak());
    }

    public static void main(String[] args) {
        Restaurant rest = new Restaurant();
        rest.waiter();
        rest.manager();
        rest.chef();
    }
}
