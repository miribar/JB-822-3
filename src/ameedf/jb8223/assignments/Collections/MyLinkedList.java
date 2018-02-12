package src.ameedf.jb8223.assignments.Collections;

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


    }
}
