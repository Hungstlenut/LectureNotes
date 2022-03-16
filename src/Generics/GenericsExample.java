package Generics;
/*
The need for generics comes into play when you need to store or use multiple types of values
without having to create a new class file every time.
 */

//Generic classes can be specified with angle brackets and whatever name you want. Usually ref with "T".
public class GenericsExample <T> {

    T thingToPrint;

    public GenericsExample (T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print () {
        System.out.println(thingToPrint);
    }

    public static void main(String[] args) {
        //here you need to specify what value type you are using or referencing to
        GenericsExample<Integer> printer = new GenericsExample<>(23);
        printer.print();
    }
}
