package STACK;

import DataStructures.Stack;

/**
 * Created by janish on 7/14/2017.
 */
public class NewStackAscending {
    public static void main(String[] args) {
        Stack stack1 = new Stack(6);
        int a[]={34, 3, 31,95,5,100};
        for (int i=0; i <a.length; i++){
            stack1.push(a[i]);
        }

        Stack snew = new Stack(6);
        while (!stack1.isEmpty()){
            int b = stack1.pop();
            if (snew.isEmpty()){
                snew.push(b);
            }
            else if(snew.peek() < b) {
                snew.push(b);
            }
            else {
                while (!snew.isEmpty() && snew.peek()> b){
                    int c = snew.pop();
                    stack1.push(c);
                }
                snew.push(b);
            }
        }
        while (!snew.isEmpty()){
            for (int i=0; i<a.length; i++){
                a[i] = snew.pop();
                System.out.println(a[i]);
            }
        }
    }
}
