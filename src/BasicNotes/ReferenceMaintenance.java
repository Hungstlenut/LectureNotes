package BasicNotes;

public class ReferenceMaintenance {
    public static void main(String[] args) {
        System.out.println("Will p1 persist?");
        Step8.Person p1 = new Step8.Person("Bogdan", 40);
        Step8.Person p2 = p1;

        p1 = null;
        System.out.println(p2);
    }
}
