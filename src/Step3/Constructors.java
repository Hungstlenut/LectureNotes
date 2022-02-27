package Step3;

public class Constructors {
    public static void main(String[] args) {
        //here we construct an object out of the Bicycle class, as a "default" constructor
        Bicycle bicycle = new Bicycle();
        //then we use it
        System.out.println("Changing to gear " + bicycle.gear[1]);

        bicycle.speedUp(10);

        bicycle.applyBrakes(20);


    }
}
