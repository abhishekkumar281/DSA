package Hash_And_Map;

import java.util.HashMap;

public class HashMapUsingSizeMethod {
    public static void main(String[] args) {

        HashMap<Integer, Double> map = new HashMap<Integer, Double>();

        map.put(111, 111.111);

        map.put(222, 222.222);

        map.put(333, 333.333);

        map.put(444, 444.444);

        map.put(555, 555.555);

        System.out.println(map.size());
    }
}
