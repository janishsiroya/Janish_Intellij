package MULTITHREAD;

//JOIN, ISALIVE, PRIORITY, NAME

/**
 * Created by janish on 6/6/2017.
 */
public class JoinisAliveDemo {

    public static void main(String args[]) throws InterruptedException {
        Thread t1 = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        Thread t2 = new Thread(() ->
        {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        }, "Hi Thread");
        t1.start();
        try {
            Thread.sleep(10);
        }
        catch (Exception e){ }
        System.out.println(t2.getName());
        t2.start();

        System.out.println("Name of thread 1 " + t1.getName()); // to get name of thread
        System.out.println("Name of thread 2 " + t2.getName());
        t1.setPriority(6);
        t1.setPriority(Thread.MIN_PRIORITY); // it is a constant in thread whose value is 1, other 2 constants are Max_PRIORIT, NORMAL_PRIORITY
        t2.setPriority(8);
        System.out.println("Priority of thread 1 = " + t1.getPriority());
        System.out.println("Priority of thread 2 = " + t2.getPriority());
        System.out.println(t1.isAlive());//it will return true, it will check if thread is still alive

        t1.join();//join method is to make sure that both this threads are excuted and than only any other thread will be executed
        t2.join();//join method is to make sure that both this threads are excuted and than only any other thread will be executed

        System.out.println("Bye"); //it is getting printed between thread t1 & t2, bcoz it is main thread
    }
}

