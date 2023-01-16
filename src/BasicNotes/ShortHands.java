








package BasicNotes;



import Step8.Person;

public class ShortHands {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("inline: " + inlineIf(42));

        System.out.println("regular: " + regularIf(42));
    }

        public static int inlineIf(int input) {
            //int b = if(condition) then 20 else 30
            int b = (input >= 0) ? 20 : 30;
            return b;
        }

        public static int regularIf(int input) {
            int b = 0;
            if (input >= 0) {
                b = 20;
            }
            else {
                b = 30;
            }
            return b;
        }

        public static Person varExample(){
            var p1 = new Person("Variable person", 30);
            Person p2 = null;
            p2 = new Person("Regular", 40);

            return p1;

        }


}


