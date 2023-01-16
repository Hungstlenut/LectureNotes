package BasicNotes;

import java.util.HashMap;
import java.util.Map;

public class ReturnStatements {
    /**
     * A return statement causes the program control to transfer back to the caller of a method.
     * Return types don't have to be just primitives and wrappers
     * You can also use objects, like HashMaps objects...
     * Taken from Stackoverflow
     */
    public int add(int x, int y) { // with arguments
        int sss = 223;
        int z = x+y+sss;
        return z;//which makes add() become z, which has to be an int type.
    }
    public static void main(String args[]) {
        ReturnStatements test = new ReturnStatements();
        int add = test.add(10, 20);
        System.out.println("The sum of x and y is: " + add);

    }

    public Map<String, String> mapTheThings(String keyWord, String certainValue)
    {
        Map<String, String> theThings = new HashMap<>();
        //do things to get the Map built
        theThings.put(keyWord, certainValue); //or something similar
        return theThings;
    }
    //annen måte å se på, fra Marie Stigen
    public int getNumber(){
        return 4;
    }

    int x = getNumber(); //her vil x = 4, siden getNumber returnerer 4
}
