package MULTITHREAD;

/**
 * Created by janish on 6/6/2017.
 */
public class ThreadDemo {
    public static void main(String args[]){
        Hello12 h2 = new Hello12();
        Hi h1 = new Hi();
        Thread t = new Thread();
        t.start();//it will just print "main thread"
        h1.start();
        h2.start();
//        h1.show();
//        h2.show();
        System.out.println("main thread");
    }
}

class Hello12 extends Thread{
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
class Hi extends Thread{
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

