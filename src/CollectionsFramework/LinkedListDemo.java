package CollectionsFramework;

import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.security.Key;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by janish on 5/28/2017.
 */
public class LinkedListDemo {
    public static void main(String args[])
    {
        ArrayList al = new ArrayList();
        al.add(20);
        al.add(40);
        //al.add("P");
        System.out.println("My arraylist = " + al );
        LinkedList ll = new LinkedList(); // default empty constructor
        ll.add(2);
        ll.add(4);
        ll.add("A");
        ll.add("F");
        System.out.println("My linkedlist after adding  = " + ll);
        ll.remove(2);
        ll.add(3, "D");
        System.out.println("My linkedlist after remove and adding at index = " + ll);
        ll.addFirst(3);
        ll.addLast(100);
        ll.add(al);
        System.out.println("My linkedlist after adding a collection = " + ll);
        ll.add(0,al);
        System.out.println("After adding collection at index 0 = " + ll);
        LinkedList lll = new LinkedList(al); // converting a colection into equivalent linkedlist
        System.out.println("Equivalent linkedlist = " + lll);
        System.out.println(ll.contains("A"));
        System.out.println(ll.contains("D"));
        System.out.println(ll.get(3));//retireval is worst
        ll.clear();
        System.out.println("After clearing the linkedlist = " + ll);
    }
}
