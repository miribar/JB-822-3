package src.ameedf.jb8223.assignments.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class MyArrayList {
    public static void main(String[]args) {

        //One way of populating the ArrayList
        String blue = "blue";
        String red = "red";
        String yellow = "yellow";
        ArrayList<String> myColorsList = new ArrayList<>();
        myColorsList.add(blue);
        myColorsList.add(red);
        myColorsList.add(yellow);
        myColorsList.add("purple");
        myColorsList.add("pink");


        printArrayList("after addition: ", myColorsList);

        //Another way of initializing the ArrayList
        ArrayList<String> myColorsList1 = new ArrayList<>(Arrays.asList("green", "brown", "white"));

        printArrayList("after init: ", myColorsList1);

        //Remove an item by object & by index
        myColorsList.remove("red");
        myColorsList1.remove(0);

        printArrayList("after remove: ", myColorsList);
        printArrayList("after remove: ", myColorsList1);

        //Add an item to a specific place
        myColorsList.add(0, "black");
        printArrayList("after addition: ", myColorsList);

        //Iterating through the ArrayList
        for (int i=0; i<myColorsList.size(); i++) {
            System.out.println(i + ": " + myColorsList.get(i));
        }

        System.out.println("");
        for (String color:myColorsList) {
            System.out.println(color);
        }

        System.out.println("");

        //Iterator (goes only forward)
        Iterator iterator = myColorsList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("");

        //ListIterator (goes forward & backwards)
        ListIterator<String> listIterator;
        listIterator = myColorsList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.nextIndex() + " " + listIterator.next() + " ");
        }

        System.out.println("");
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previousIndex() + " " + listIterator.previous() + " ");
        }
    }

    //Prints the ArrayList elements
    public static void printArrayList(String msg, ArrayList<String> myList) {
        System.out.println(msg + myList);
    }
}
