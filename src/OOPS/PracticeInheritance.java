package OOPS;

/**
 * Created by janish on 3/24/2017.
 */
public class PracticeInheritance extends Student1 {
    public static void main(String args[])
    {
        Student1 s1 = new Student1();
        s1.details(1,"Math",100);
        System.out.println(s1);
    }
}

class Student1{
    int roll_num;
    String sub;
    int marks;

    public void details(int  rn, String subject, int m)
    {
        roll_num = rn;
        sub = subject;
        marks = m;
        System.out.println(roll_num);
        System.out.println(sub);
        System.out.println(marks);
    }
}
