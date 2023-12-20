package collections;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        //Key for a value
        //hashmap implements map
        Map<Integer, String> map1 = new HashMap<>();

        //this is for hashmap, you use put instead of add
        map1.put(1, "January");
        map1.put(2,"February");
        map1.put(3,"March");
        map1.put(2,"April");

        //it will show object key instead
        //System.out.println(map1.get(1));
        for (int key: map1.keySet()) {
            System.out.println(map1.get(key));
        }

    }
}
