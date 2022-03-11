package Step3;

public class MethodOverload {
        /* method overload means that we reuse the same function name over an over, but
        it has to contain different parameters for Java to understand the difference between them.

        Method overloading is either achieved by:
        - changing the number of arguments/parameters
        - changing the datatype of the parameters

         */
        private static void display(int a){
            System.out.println("Arguments: " + a);
        }

        private static void display(int a, int b){
            System.out.println("Arguments: " + a + " and " + b);
        }

        public static void main(String[] args) {
            display(1);
            display(1, 4);
        }
    }

