import java.util.HashMap;
import java.util.Map;

class mapInterface {
    public static void main(String[] args) {
        //creating a map using the hashmap
        Map<String, Integer> numbers = new HashMap<>();

        //insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        //access keys of the map
        System.out.println("Keys: " +numbers.keySet());

        //access values of the map
        System.out.println("Values "+ numbers.values());

        //access entries on the map
        System.out.println("Entries: " + numbers.entrySet());

        //remove elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed this value: " + value);
    }
}
