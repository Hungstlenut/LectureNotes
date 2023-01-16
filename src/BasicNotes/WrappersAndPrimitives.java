package BasicNotes;

import org.w3c.dom.ls.LSOutput;

import java.io.FilterOutputStream;

public class WrappersAndPrimitives {
    public static void main(String[] args) {
    /*
    Examples:

    PRIMITIVE  WRAPPERS

    int         Integer
    char        Character
    boolean     Boolean

    String is not in the wrapper class, because it wraps char[], which is not a primitive value.

    Unlike Character and Boolean, which is a child class of Object class, the Integer class is
    in fact under the Number class; which in turn is under Object class.

    All wrapper classes we see above including String, is a final class.

    When to use wrappers:
    While using collection framework
    To convert primitive data type to objects and vice versa
    Many libraries in java deals with objects, not with primitive data types (like arrays)
    */


    //BOXING AND UNBOXING
    //Autoboxing occurs when java automatically makes a conversion between the primitive data type
    //to corresponding object wrapper class.
    //Example:
    int a = 100;
    Integer b = a;

    //or
    // Boxing when you manually do it:
    Integer c = Integer.valueOf(a);

    //Unboxing occurs when you convert the object of wrapper class to its respective primitive type.
    Integer d = 98;
        System.out.println(d.intValue());
    //or
        int e = d.intValue();
        System.out.println("Integer to int: " + e);
    //or
    //AutoUnboxing
        Integer f = 78;
        int g = f;
        System.out.println("AutoUnboxed: " + f);
        
    }


}
