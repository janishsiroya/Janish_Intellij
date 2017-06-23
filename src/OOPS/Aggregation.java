package OOPS;

/**
 * Created by janish on 3/16/2017.
 */
public class Aggregation {
    String name;
    int id;
    Address a;
    Student s;
    Aggregation(String name1, int id1, Address a1, Student s1)
    {
        this.name = name1;
        this.id = id1;
        this.a=a1;
        this.s = s1;
    }
    public static void main(String args[])
    {
        Address addr = new Address(148, "William St");
        Student sub = new Student("Maths", "English");
        Aggregation agg = new Aggregation("Janish",1, addr, sub);

        System.out.println(agg.name);
        System.out.println(agg.id);
        System.out.println(agg.a.street_num);
        System.out.println(agg.a.street_name);
        System.out.println(agg.s.sub1);
        System.out.println(agg.s.sub2);
    }
}

class Address
{
    int street_num;
    String street_name;
    Address(int street_num1, String street_name1)
    {
        this.street_num = street_num1;
        this.street_name = street_name1;
    }
}

class Student
{
    String sub1;
    String sub2;
    Student(String sub11, String sub22)
    {
        this.sub1= sub11;
        this.sub2=sub22;
    }
}