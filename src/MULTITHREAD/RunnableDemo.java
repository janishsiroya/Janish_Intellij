package MULTITHREAD;

/**
 * Created by janish on 6/6/2017.
 */
public class RunnableDemo {
    public static void main(String args[]){
        Runnable h2 = new Hello12();//It works even if u create object of the corresponding class
        Runnable h1 = new Hi();
        Thread t1 = new Thread(h1);//you have to pass the object so that start() will call the run method of the classes
        Thread t2 = new Thread(h2);//and not the run method of Thread class.
        t1.start();
        t2.start();
//        h1.start();
//        h2.start();
//        h1.show();
//        h2.show();
        System.out.println("main thread");
    }
}

class Hello123 implements Runnable {
    public void run() {
        for (int i =0; i<5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}
class Hi1 implements Runnable{
    public void run() {
        for (int i =0; i<5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}
