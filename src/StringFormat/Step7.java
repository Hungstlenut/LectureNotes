package StringFormat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Step7 {
    public static void main(String[] args) {
        //String format examples
        String firstName = "Xuan";
        String middleName = "Huy";
        String lastName = "Nguyen";

        String str = String.format("My name is %S %s %s", firstName, middleName, lastName);
        System.out.println(str);
        // %[parameter_index$] [width] [.precision] conversion_target
        String str2 = String.format("The name is %3$s %2$s %1$s ", firstName, middleName, lastName);
        System.out.println(str2);

        //display current date
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);

        //converting a string into a date format
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM uuuu");
        String date = "03 Feb 2017";
        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(localDate);

    }
}
