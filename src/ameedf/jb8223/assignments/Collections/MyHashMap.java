package src.ameedf.jb8223.assignments.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyHashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> myHashMap= new HashMap<Integer, String>();

        myHashMap.put(1, "One");
        myHashMap.put(2, "Two");
        myHashMap.put(3, "Three");
        myHashMap.put(4, "Four");

        System.out.println(myHashMap);

        System.out.println("The 2nd element of the hashmap is: " + myHashMap.get(2));

        Set set = myHashMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println(mapEntry.getKey() + " : " + mapEntry.getValue());
        }
    }
}
