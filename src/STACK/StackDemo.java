package STACK;

import DataStructures.Stack;

/**
 * Created by janish on 7/11/2017.
 */
public class StackDemo {
    int top;
    int size;
    int[] a;

    public StackDemo(int p){
        size = p;
        a = new int[size];
        top = -1;
    }
    public void push(int p){
        a[++top] = p;
    }
    public int pop(){
        return a[top--];
    }

    public int peek(){
        return (a[top]);
    }
    public boolean isEmpty(){
        return (top == -1);
    }
    public int isFull(){
        return a[top-1];
    }

    public static void main(String[] args) {
        Stack s = new Stack(4);
        s.push(4);
        s.push(1);
        s.push(100);
        s.push(25);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());

        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());

    }

}
