package Step8;
/*
Abstract classes are more like an idea or a sketch of what a particular class should contain or be able to do.
The concept abstract can be a part of something, but it can not be that something. However, it can not be
called/constructed directly. Also, having abstract classes helps us organize better.

Interface classes can only contain abstract methods.

Conclusion:
Abstract classes can therefore contain both abstract methods AND implemented methods (a method that has a function).
While Interface classes can ONLY contain abstract methods.
 */

abstract class Dog {
    public void bark () {
        System.out.println("I'm a dog, and I");
        System.out.println("Bark!");
    }
    //creating this method here, means that we have to specify it another place...
    //this also gives the opportunity to make each dog race poop differently, but the "bark" is the same for all dogs.
    public abstract void poop();
}
//this class inherits the function of "Dog", thereby also having "bark".
class Chihuahua extends Dog {
    //we need to specify "poop" here:
    public void poop() {
        System.out.println("Pooped");
    }
}
//using interface, no need to specify class after...
interface Bird {
    //sketching up methods without a body, so that we can specify later...
    String color = "Black";
    void fly();

    void chirp();
}

class Sparrow implements Bird {

    @Override
    public void chirp() {
        System.out.println("I'm a bird, and I'm " + color + "\n and ");
        System.out.println("Chirp chirp!");
    }

    @Override
    public void fly() {
        System.out.println("Flying high");
    }
}

public class AbstractTutorial {
    public static void main(String[] args) {
       //we can not call and construct the abstract class Dog above, so we need the Chihuahua class
       Chihuahua c = new Chihuahua();
       c.bark();
       c.poop();

       Sparrow s = new Sparrow();
       s.chirp();
       s.fly();
    }
}
