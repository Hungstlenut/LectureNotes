package BasicNotes;

public class Enum {

    Day day;//this variable has access to the properties inside its class.

    //Enums are like a class of their own...
    public enum Day {//Everything that comes from this enum type gets these properties
        MONDAY ("...but it is also a new start!", "there's more???"),
        TUESDAY ("a step further...", "ehhh..."),
        WEDNESDAY ("coffee!?", "brainfart"),
        THURSDAY ("more coffee!?", "ok"),
        FRIDAY ("tacos!?", "sauce?"),
        SATURDAY ("playtime!", "all play no work makes Jonny a dull boy"),
        SUNDAY ("laundry though...", "aiht!");

        //Enum class understands that the variables below are pointing to the variables above...
        private final String hiddenMessage;
        private final String hiddenMessage2;

        //Since enum is behaving like a class, and we made the variables have "hiddenMessages", we need a constructor.
        //This constructor has to take the variables above into play.
        Day(String hiddenMessage, String hiddenMessage2) {
            this.hiddenMessage = hiddenMessage;
            this.hiddenMessage2 = hiddenMessage2;
        }
    }
    //Constructor
    public Enum (Day aDay) {//takes in an argument from enum type Day
        this.day = aDay;
    }

    public void justHowItGoes () {
        switch (day) {
            case MONDAY -> System.out.println("Mondays are shite");
            case TUESDAY -> System.out.println("Tuesdays...");
            case WEDNESDAY -> System.out.println("Halfway");
            case THURSDAY -> System.out.println("Thursday, let's go!");
            case FRIDAY -> System.out.println("FRIDAY!");
            case SATURDAY -> System.out.println("<3");
            case SUNDAY -> System.out.println("Chill...");
        }
    }

    public static void main(String[] args) {
        Enum day1 = new Enum(Day.MONDAY);
        day1.justHowItGoes();
        System.out.println(day1.day.hiddenMessage);
        System.out.println(day1.day.hiddenMessage2);

    }

}


