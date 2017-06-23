package OOPS;

///**
// * Created by janish on 3/19/2017.
// */
 class Supermethod extends Super1 {
        Supermethod()
        {
            //by default constructor of parent class is called using super
            System.out.println("No args constructor");
        }
        Supermethod(int i)
        {
            System.out.println("Constructor with args");
        }
        void display()
        {
        System.out.println("Display method");
        }
    public static void main(String args[])
    {
        Supermethod s = new Supermethod();
        s.display();
        Supermethod s2 =new Supermethod(25);
        s2.display();
    }
}

class Super1
{
    Super1()
    {
        System.out.println("Constructor of parent class");
    }
}

//class Supermethod extends Super1
//{
//    Supermethod(){
//	/* Compile adds super() here at the first line
//	 * of this constructor implicitly
//	 */
//        System.out.println("Constructor of Subclass");
//    }
//    Supermethod(int num){
//	/* Compile adds super() here at the first line
//	 * of this constructor implicitly
//	 */
//        System.out.println("Constructor with arg");
//    }
//    void display(){
//        System.out.println("Hello");
//    }
//    public static void main(String args[]){
//        // Creating object using default constructor
//        Supermethod s1= new Supermethod();
//        //Calling sub class method
//        s1.display();
//        //Creating object 2 using arg constructor
//        Supermethod s2= new Supermethod(10);
//        s2.display();
//    }
//}