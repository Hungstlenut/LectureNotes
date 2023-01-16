package Generics;
/*
The need for generics comes into play when you need to store or use multiple types of values
without having to create a new class file every time.
Generics can not be used with primitive types, which can be substituted with wrappers.
 */

import java.util.ArrayList;
import java.util.List;

//Generic classes can be specified with angle brackets and whatever name you want. Usually ref with "T".
public class GenericsExample <T> { //now, this class can take in type parameter T, which can be added upon.

    T thingToPrint;

    public GenericsExample (T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print () {
        System.out.println(thingToPrint);
    }

    public <T> void array (T something) {
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.add(something);

        System.out.println(arrayList);
    }
    //usually written like this
    public void array2 (Integer something) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(something);

        System.out.println(arrayList);
    }
    //T is type parameter, which is declaring what type goes in as parameter
    //String is the mandatory return type
    public static <T> String something (Integer number, T something) {
        System.out.println(number);
        System.out.println(something);
        System.out.println(number + "" + something);//can't add them together, so...
        return null;//can't return any parameter variables, because none of them are String type!
    }

    //could've done this as well
    public static <T> T somethingElse (T anything, T anything2) {
        System.out.println(anything + (String) anything2); //can't combine 2 whatever type parameters with +
        return anything;
    }



    public static void main(String[] args) {
//here you need to specify what value type you are using or referencing to, then suddenly, it can print Integers
        GenericsExample<Integer> printer = new GenericsExample<>(23);
        printer.print();

        //no need to specify when calling a method with type T, which could be anything...
        printer.array(123);
        something(345, "anything");

        somethingElse(100, " years of pain");


    }
}
