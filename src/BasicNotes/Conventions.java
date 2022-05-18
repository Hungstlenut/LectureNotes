package BasicNotes;

import UpAndDownCasting.Cat;

import java.util.ArrayList;

public class Conventions <T> {
    /*
    Looking at typing and assigning conventions
     */
//An empty variable declared
    T thingToPrint;
//Can be declared only once, cannot be overridden, cannot be extended. Write in uppercase!
//Within class: Y, within package: N, outside package by subclass only: N, outside package: N
    private final String SOMETHING = "Something";
//Publicly accessible variable
    public int aNumber = 123;
//Within class: Y, within package: Y, outside package by subclass only: Y, outside package: N
    protected Integer aPROTECTEDNumberWithObjectTypeInteger = 345;
//Default modifier - Within class: Y, within package: Y, outside package by subclass only: N, outside package: N
    String somethingDefault = "Something";

//-----------Methods---------------------------------------------------------------------------------------------------
    //Constructor that takes in a made up class, that can be anything.
    public Conventions(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }
    //Giving this method a return type of String
    public String print() {
        return null;
    }
    //this method returns nothing, meant for executing through the object of the respective class
    public void print2 () {

    }
    //can be called without instantiating, but requires the return type of String
    public static String print3 () {
        return null;
    }
    //no instantiating, and no returning.
    public static void print4() {
        System.out.println("I can be called without instantiating");
    }
    //a method with T as return type
    public static <T> void print5(T shout) {
        System.out.println(shout);
    }
//-------------------------------------------------------------------------------------------------------


    public static void main(String[] args) {



    }
}
