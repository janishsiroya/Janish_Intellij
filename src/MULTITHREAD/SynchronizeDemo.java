package MULTITHREAD;

/**
 * Created by janish on 6/6/2017.
 */
public class SynchronizeDemo {
    public static void main(String args[]) throws InterruptedException {
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000;i++)
                {
                    c.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<1000;i++)
                {
                    c.increment();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();//join here is important because if you don't write join, than by the time thread t is executing
        //the main thread executes between that time and hence the output without writing the join() is 0
        //so we are writing here join to make main thread understand that wait untill thread t is executed
        System.out.println(c.count); //main thread
    }
}


class Counter{
    int count;
    public synchronized void increment() //by making the method synchronized only one thread can execute at a time & it becomes thread safe
    {
        count++;
    }
}