package src.ameedf.jb8223.assignments.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {

    public static void main(String[] args) {

        HashSet<String> myHashSet = new HashSet<>();

        myHashSet.add("One");
        myHashSet.add("Two");
        myHashSet.add(null);
        myHashSet.add("Three");
        myHashSet.add("Four");
        myHashSet.add(null);
        myHashSet.add("Three");
        myHashSet.add("One");

        System.out.println(myHashSet);   // will return the elements, without duplicates, in a random value

        Object clone = myHashSet.clone();
        System.out.println(clone);

        Boolean exists = myHashSet.contains("Five");   // will return 'false'
        System.out.println(exists);

        myHashSet.remove("Four");
        System.out.println(myHashSet);

        for (String item : myHashSet) {
            System.out.println("item is: " + item);
        }

        Iterator<String> iterator = myHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("item is: " + iterator.next());
        }
    }
}
