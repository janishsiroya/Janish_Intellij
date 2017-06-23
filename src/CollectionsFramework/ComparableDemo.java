package CollectionsFramework;
import java.util.*;
import java.io.*;
/**
 * Created by janish on 5/28/2017.
 */
public class ComparableDemo {
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.roll_no +" "+st.name+" "+st.age);
        }
    }
}

class Student implements Comparable<Student>{
    String name;
    int roll_no;
    int age;
    Student(int roll_no, String name, int age) {
        this.name = name;
        this.roll_no=roll_no;
        this.age=age;
    }
    public int compareTo(Student st){
        if(age==st.age)
            return 0;
        else if(age>st.age)
            return 1;
        else
            return -1;
    }
}
