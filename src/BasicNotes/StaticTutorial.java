package BasicNotes;
/*
it's called "static" because it is universal to every object / member within the Class

So this particular quality "doesn't change" even when individual member may differ in other aspects.

A good example will be, say the number of eyes for a human being.
Regardless of your race, sex etc, the default number of eyes for a human is 2.

So we can set the "number of eyes" variable to 2 for the "human" class and make it "static".
Now as far as your program is concerned, humans will have two eyes.
Or if you change it to 3, then every human will have 3 eyes

However, if you want to customize the number of eyes for each individual human, (e.g. because some human are pirates)
then you can drop the "static" and call on the variable by "jackSparrow.numberOfEyes" for example, and set the number
on a per human basis, just like other traits particular to each member of the class.
 */
public class StaticTutorial {
    /*
    int a = 10;

    public static void main(String[] args) {
        System.out.println(a);//this line would not work, and java would suggest making a static.
    }

     */
    //to work around this...
    int a = 2;

    static int b = 2;

    public static void main(String[] args) {
        StaticTutorial anObject = new StaticTutorial();
        System.out.println(anObject.a);

        System.out.println(b);
        /*
        We could for example not write:
        anObject.b(...) and do something to b
         */


        getterAndSetter C = new getterAndSetter();
        System.out.println(C.getC());
        System.out.println(anObject.equals(b));

    }
    //...or, we can just make a static in this case.

}

class getterAndSetter {
    int c = 2;

    public void setC(int C) {
        this.c = C;
    }
    public int getC(){
        return c;
    }

    public String toString(){
        return "toStringing" + getC();
    }
}