
import java.util.HashMap;

public class dequeue {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        // adding values
        hm.put("a", 2);
        hm.put("b", 2);
        hm.put("c", 3);
        hm.put("d", 4);
        hm.put("e", 5);

        System.out.println("Map is: " + hm);
        System.out.println("size of the map is: " + hm.size());
        System.out.println("is map contains 'a': " + hm.containsKey("a"));
        System.out.println("is map contains 'f': " + hm.containsKey("f"));

        // updating value associated with key 'a'
        hm.put("a", 10);

        System.out.println("Map is: " + hm);
    }
}
