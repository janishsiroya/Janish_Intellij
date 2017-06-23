package Practice;

public class StackPract{
    private int size;
    private int top;
    private int[] array;
    public StackPract(int p) {
        size = p;
        array = new int[size];
        top = -1;
    }
    public void push(int u) {
        array[++top] = u;
    }
    public int pop()
    {
        return array[top--];
    }
    public int peek()
    {
        return array[top];
    }
    public boolean isFull()
    {
        return (top==size-1);
    }
    public boolean isEmpty()
    {
        return (top == -1);
    }
    public static void main(String args[])
    {
        StackPract s =new StackPract(6);
        s.push(20);
        s.push(25);
        s.push(55);
        s.push(45);
        s.push(35);
        s.push(100);
        System.out.println(s.isFull());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
        while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }

    }


}