package MULTITHREAD;

/**
 * Created by janish on 6/6/2017.
 */
public class InterThreadDemo {
    public static void main(String args[]){
    }
}

class Producer{
    P p;
    public Producer(P p){
        this.p=p;
        }
        public void run(){
        int i=0;
        while (true)
        {
            p.put(i++);
        }

        }
}
class P{
    int num;
    public void put(int num){
        this.num=num;
    }
    public int getNum(){
        return num;
    }
}
