package Constructors;

public class CustomConstructor {
    public static void main(String[] args) {
        //line of code below explained:
        //reference to that class - Dog1 = new object made from the custom constructor.
        CustomDog Dog1 = new CustomDog();
        /*
        this line below is going to print out the new Dog1 "object" that we
        made above. Jave is using our custom constructor that has no parameters,
        as we specified above. Calling that constructor without toString method,
        would give us an address in memory.
         */
        System.out.println(Dog1);

        //let's use the other constructor with parameters...
        CustomDog Dog2 = new CustomDog("Shiba", 3);

        System.out.println(Dog2);

    }


}
