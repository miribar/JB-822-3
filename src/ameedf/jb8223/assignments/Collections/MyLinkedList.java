package src.ameedf.jb8223.assignments.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {

        String red = "Red";
        String blue = "Blue";
        String green = "Green";

        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add(green);
        myLinkedList.addFirst(blue);
        myLinkedList.addLast(red);

        //Loop through the LinkedList
        for (String element: myLinkedList) {
            System.out.println(element);
        }

        for (int i=0; i<myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i) + ", ");
        }

        Iterator iterator = myLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("\nitem: " + iterator.next());
        }
    }
}
