package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * LinkedList is a doubly-linked implementation of the List interface.
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(9);

        System.out.println("Contents of list: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.add(0, 6);                                 //Adds/inserts the value 6 at index 0

        System.out.println("Contents of list: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.add(2, 8);                                 //Adds/inserts the value 8 at index 2
        System.out.println("Contents of list: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        list.remove(1);                                 //Removes the element at index 1
        System.out.println("Contents of list: ");
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //An Iterator is an object that iterates through the values of a Collection
        //An Iterator for a List/Collection is similar to a ResultSet returned from a database query.
        System.out.println("Using an iterator: ");
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();
    }

}
