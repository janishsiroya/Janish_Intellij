    /**
     * Created by janish on 3/22/2017.
     */
    public class SingletonPattern {
        public static void main(String args[]) {
            Single object = Single.getInstance();
            object.display();
        }
    }
    class Single {
        private static Single instance = new Single();
        private Single()
        {    }

        public static Single getInstance() {
            return instance;
        }
        public void display(){
            System.out.println("Hello world");
        }
    }
