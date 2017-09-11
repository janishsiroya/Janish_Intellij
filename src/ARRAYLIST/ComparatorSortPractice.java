package ARRAYLIST;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Created by janish on 7/12/2017.
 */
public class ComparatorSortPractice {
    public static void main(String[] args) {
        List<Student> l =new ArrayList<>();
        l.add(new Student("jansih",1));
        l.add(new Student("anu", 5));
        l.add(new Student("siroya",3));

        Collections.sort(l,new Compa());
        for (Student s :l)
            System.out.println(s);
    }
}

class Compa implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        if(s1.getId()>s2.getId()){
            return 1;
        }
        else {
            return -1;
        }
    }
}

class Student{
    String name;
    int id;
    public Student(String name1, int id1){
        this.name=name1;
        this.id=id1;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getString(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public String toString(){
        return "Name: "+this.name+"-- Id: "+this.id;
    }
}
