package Step3;

//this class when called is going to be the "default" constructor
public class Bicycle {
    //attributes of the class
    int speed = 10;
    int[] gear = {0, 1, 2, 3, 4, 5};

    void speedUp (int increment) {
        //this is also a way to refer to the attributes in the outer scope
        this.speed += increment;
    }
    void applyBrakes (int decrement) {
        speed -= decrement;
    }

    /*here we make our own object, but that means we would have to pass in arguments into these parameters
    in main. Rendering the default object useless.

    public Bicycle(int s, int g) {
        int s = 5;
        int[] g = {0, 1, 2, 3, 4, 5, 6};
    }
    */
}
