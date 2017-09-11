package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by janish on 7/12/2017.
 */
public class ComparatorSortAL {
    public static void main(String[] args) {
        List<Employee> l = new ArrayList<Employee>();
        l.add(new Employee("janish",25000));
        l.add(new Employee("manish",35000));
        l.add(new Employee("anish",55000));
        l.add(new Employee("jaanish",45000));
        l.add(new Employee("danish",15000));

        Collections.sort(l,new Comp());
        System.out.println("Sorted list entries: ");
        for (Employee e:l){
            System.out.println(e);
        }
    }
}

class Comp implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary()>e2.getSalary()){
            return 1;
        }
        else {
            return -1;
        }
    }
}


class Employee{
    String name;
    int salary;
    public Employee(String name, int salary){
        this.salary=salary;
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}
