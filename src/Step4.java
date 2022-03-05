import java.util.ArrayList;
import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        Scanner addCars = new Scanner(System.in);
        for (int i = 0; i < 4; i ++) {
            if (cars.size() == 4) { //er dette riktig ift at jeg vil si at hvis arraylisten er fylt 4 plasser?
                for (int i2 = 0; i2 < cars.size(); i2++) {
                    System.out.println(cars.get(i2));
                }
            }
            else {
                System.out.println("Enter car name:");

                String carName = addCars.nextLine();

                cars.add(carName);
            }
        }
/*      System.out.println("Enter car name:");

        String carName = addCars.nextLine();

        cars.add(carName);

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");


        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        for (String i : cars) { //this is a "for-each" loop
            System.out.println(i);
        }
*/
    }

}
