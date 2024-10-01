package Hash_And_Map;
import java.util.*;

public class HashMapAndHashSet {
    public static void main(String[] args) {

        //  HashSet

        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);

        if(hs.contains(10)){
            System.out.println("Yes contain");
        }
        System.out.println(hs);


        // HashMap

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Abhishek", 10);
        map.put("Niraj", 30);
        map.put("Nagmani", 20);
        System.out.println("Size of map is: " + map.size());
        System.out.println(map);

        if (map.containsKey("Abhishek")) {
            Integer a = map.get("Abhishek");

                System.out.println("value for key" + " \"Abhishek\" is: " + a);
        }
    }
}
