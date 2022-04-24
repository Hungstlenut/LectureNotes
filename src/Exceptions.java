public class Exceptions {
    public static void main(String[] args) {
        // try/catch/finally brukes for å prøve å fange feil slik at resten av kodestrengen(e) kan fortsatt kjøres.

        try {
            int i = 9 / 0;

            System.out.println(i);
        }
        catch (Exception e){
            System.err.println("Error detected");
        }
        finally { //uavhengig av utfallet over, så vil det printes ut:
            System.out.println("bye");
        }

    }
}
