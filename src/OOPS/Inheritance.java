package OOPS;

/**
 * Created by janish on 3/17/2017.
 */
public class Inheritance {
    public static void main(String args [])
    {
        Dog d = new Dog();

        d.name = "Bunny";
        d.category= "Lebrador";
        d.type  = "Land";
        d.id = 100;
        d.animaldog();
    }
}

class Animals
{
    String name;
    String category;
    void animal()
    {
        System.out.println(name);
        System.out.println(category);
    }
}

class Dog extends Animals
{
    String type;
    int id;
    void animaldog()
    {
        System.out.println(type);
        System.out.println(id);
        System.out.println(name);
        System.out.println(category);
    }
}
