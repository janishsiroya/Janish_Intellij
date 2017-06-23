package Practice;

/**
 * Created by janish on 4/24/2017.
 */
public class StackPractice1 {
    private int size;
    private int top;
    private int array[];

    public StackPractice1(int s)
    {
        size = s;
        top = -1;
        array = new int[size];
    }
    public void push(int u){
        array[++top] = u;
    }
    public int pop(){
        return array[top--];
    }
    public boolean isEmpty()
    {
        return (top==-1);
    }
    public int peek()
    {
        return array[top];
    }
    public boolean isFull()
    {
        return (top == size - 1);
    }
    public static void main(String args[])
    {
        StackPractice1 sp1 = new StackPractice1(4);
        sp1.push(5);
        sp1.push(6);
        sp1.push(7);
        sp1.push(9);
        System.out.println(sp1.pop());
    }
}
