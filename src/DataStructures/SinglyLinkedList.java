package DataStructures;
import java.util.*;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * Created by janish on 4/26/2017.
 */
public class SinglyLinkedList {
    Node head;
    int count;

    public SinglyLinkedList(Node newhead) {
        head = newhead;
        count = 0;
    }


    public void addLast(int newdata) {
        Node temp = new Node(newdata);
        Node current = head;
        if(current!=null) {
            while (current.getNext()!=null) {
                current=current.getNext();
            }
            current.setNext(temp);
            count++;
        }
        else {
            head = temp;
        }
    }

    public void addFirst(int newdata) {
        Node temp=new Node(newdata);
        Node current = head;
        if(current!=null) {
            head = temp;
            temp.next = current.next;
            count++;
        }
        else
            head = temp;
    }

    public void addposition(int newdata, int index) {
        Node current = head;
        if(current==null) {
            return;
        }
        Node temp = new Node(newdata);

        for (int i=1; i<index-1; i++) {
            current=current.getNext();
        }
        Node allNext = current.next;
        current.next = temp;
        temp.next = allNext;
    }

    public void deleteFirst() {
        Node current = head;
        if(current!=null) {
            head = head.getNext();
        }
        else
            System.out.println("Linked list is empty");
    }

    public void deleteLast() {
        Node current = head;
        if(current!=null) {
            while (current.getNext().getNext()!=null) {
                current = current.getNext();
            }
            current.next = null;
            count--;
        }
    }
    public void deleteposition(int index) {
        Node current = head;
        if(current!=null) {
            for (int i=1;i<index-1; i++) {
                current=current.getNext();
            }
            current.next = current.next.next;
            count--;
        }
        else
            System.out.println("No element at that position");
    }
    public void display()
    {
        Node current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
    public static void main(String args[])
    {
        Node n =new Node(5);
        SinglyLinkedList sl = new SinglyLinkedList(n);
        sl.addFirst(55);
        sl.addLast(50);
        sl.addLast(80);
        sl.addLast(100);
        sl.addLast(110);
        //sl.deleteLast();
        //sl.deleteFirst();
        sl.deleteposition(2);

        //System.out.println(n.getData());
        //sl.display();
        sl.display();
        System.out.println("**************");
        sl.addposition(2,1);
        sl.display();
        //sl.deleteposition(0);
        //sl.pop();
    }
}

class Node
{
    int data;
    Node next;

    public Node()
    {
        next = null;
        data = 0;
    }
    public Node(int newdata)
    {
        data = newdata;
        next = null;
    }

    public void setData(int newdata)
    {
        data = newdata;
    }
    public void setNext(Node newnext)
    {
        next = newnext;
    }
    public int getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
}
