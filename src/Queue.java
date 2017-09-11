//import java.util.NoSuchElementException;
//
///**
// * Created by janish on 3/20/2017.
// */
//
//public class Queue {
//    public static void main(String args[])
//    {
//        Queue q = new Queue();
//
//    }
//}
//class ImplementQueue
//{
//    private int queue[];
//    private int front, rear, len, size;
//    public ImplementQueue(int s)
//    {
//        size = s;
//        queue = new int[size];
//        front = -1;
//        rear = -1;
//        len = 0;
//    }
//    public boolean isEmpty()
//    {
//        return front == -1;
//    }
//    public boolean isFull()
//    {
//        return front== 0 && rear == size-1;
//    }
//    public int getSize()
//    {
//        return size;
//    }
//    public int peek()
//    {
//        if(isEmpty())
//            throw new NoSuchElementException("Underflow exception");
//        return queue[front];
//    }
//    public void enqueue(int p)
//    {
//        if(rear == -1)
//        {
//            //System.out.println("");
//            front = 0;
//            rear = 0;
//            queue[rear] = p;
//        }
//        else if(rear+1> = size)
//        {
//            throw new IndexOutOfBoundsException("Overflow Exception");
//        }
//        else if(rear + 1 =< size)
//        {
//            queue[++rear] = p;
//            len++;
//        }
//    }
//    public int dequeue()
//    {
//        if (isEmpty())
//        {
//            throw new NoSuchElementException("No such element found");
//        }
//        else
//        {
//            len--;
//            int element = queue[front];
//            if(front==rear)
//            {
//                front = -1;
//                rear = -1;
//            }
//            else
//            {
//                front++;
//                return element;
//            }
//        }
//}}
//
