import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> someNumbers = new HashMap<>();

        someNumbers.put("a", 10);
        someNumbers.put("b", 3);
        someNumbers.put("c", 99);


        System.out.println(someNumbers.get("a"));
        System.out.println(someNumbers.containsValue(99));
    }
}
