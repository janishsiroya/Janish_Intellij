package DataStructures;

/** * Created by janish on 3/20/2017. */
public class Stack {
    private int size;
    private int[] array;
    private int top;
    public Stack(int a)
    {
        size = a;
        array = new int[size];
        top = -1;
    }
    public void push(int p)
    {
        array[++top] = p;
    }
    public int pop()
    {
        return array[top--];
    }
    public boolean isEmpty()
    {
        return (top == -1);
    }
    public boolean isFull()
    {
        return (top == size -1);
    }
    public int peek()
    {
        return array[top];
    }
    public static void main(String args[])
    {
        Stack st = new Stack(5);
        st.push(25);
        st.push(45);
        //st.push(10);
        st.push(10);
        st.push(10);
        st.push(10);
        //int g = st.pop();
        System.out.println("Pop first element" + "=" + st.pop());
        System.out.println("Peek element is " + "=" + st.peek());
        while (!st.isEmpty())
        {
            int d = st.pop();
            System.out.println(d);
        }
    }
}
