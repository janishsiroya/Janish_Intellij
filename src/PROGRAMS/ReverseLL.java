package PROGRAMS;

/**
 * Created by janish on 6/12/2017.
 */

class Node {
    int data;
    Node next;
}

public class ReverseLL {

    public Node head;

    void populateLink(int input){

        Node temp = new Node();
        temp.data = input;
        temp.next = null;
        if (head == null){
            head = temp;
            return;
        }

        Node temp1 = head;

        while(temp1.next != null){
            temp1 = temp1.next;
        }
        temp1.next = temp;
    }

    void reverse(Node node){
        if(node == null)
            return;

        reverse(node.next);
        System.out.println("Reverse LinkList" + node.data);
    }

    void Display(){

        Node node = head;
        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        ReverseLL rl = new ReverseLL();
        for(int i=1; i<10; i++)
            rl.populateLink(i*10);

        rl.Display();

        rl.reverse(rl.head);
    }
}
