package Step8;

import java.util.HashMap;

public class HashMaps {
        public static void main(String[] args) {
            // Create a HashMap object called capitalCities
            HashMap<String, String> capitalCities = new HashMap<String, String>();

            // Add keys and values (Country, City)
            capitalCities.put("England", "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("USA", "Washington DC");
            System.out.println(capitalCities);
        }

    // https://www.w3schools.com/java/java_hashmap.asp
}
