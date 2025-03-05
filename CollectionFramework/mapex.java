package CollectionFramework;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class mapex {
    public static void main(String[] args) {
        
     LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();

        // Adding key-value pairs
        map1.put("Apple", 3);
        map1.put("Banana", 5);
        map1.put("Orange", 2);

        System.out.println("Apple: " + map1.get("Apple"));
        
        // Iterate through the map (Insertion Order)
        for (String key : map1.keySet()) {
            System.out.println(key + ": " + map1.get(key));
        }


         TreeMap<String, Integer> map2 = new TreeMap<>();

        // Adding key-value pairs
        map2.put("Apple", 3);
        map2.put("Banana", 5);
        map2.put("Orange", 2);

        // Retrieve value by key
        System.out.println("Apple: " + map2.get("Apple"));

        // Iterate through the map (Sorted Order)
        for (String key : map2.keySet()) {
            System.out.println(key + ": " + map2.get(key));
        }


          Hashtable<String, Integer> map3 = new Hashtable<>();

        // Adding key-value pairs
        map3.put("Apple", 3);
        map3.put("Banana", 5);
        map3.put("Orange", 2);

        // Retrieve value by key
        System.out.println("Apple: " + map3.get("Apple"));

        // Iterate through the map
        for (String key : map3.keySet()) {
            System.out.println(key + ": " + map3.get(key));
        }


          ConcurrentHashMap<String, Integer> map4 = new ConcurrentHashMap<>();

        // Adding key-value pairs
        map4.put("Apple", 3);
        map4.put("Banana", 5);
        map4.put("Orange", 2);

        // Retrieve value by key
        System.out.println("Apple: " + map4.get("Apple"));

        // Iterate through the map
        for (String key : map4.keySet()) {
            System.out.println(key + ": " + map4.get(key));
        }

        // HashMap<String, Integer> map = new HashMap<>();

        // // Adding key-value pairs
        // map.put("Apple", 3);
        // map.put("Banana", 5);
        // map.put("Orange", 2);
        
        // // Retrieve value by key
        // System.out.println("Apple: " + map.get("Apple"));
        
        // // Iterate through the map
        // for (String key : map.keySet()) {
        //     System.out.println(key + ": " + map.get(key));
        // }
    }
}
