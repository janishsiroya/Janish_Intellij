package OOPS;

/**
 * Created by janish on 3/17/2017.
 */
public class Encapsulation {
    private String name;
    private String city;
    private  int id;
    private int phone = 803;

    public String getName()
    {
        return name;
    }
    public String getCity()
    {
        return city;
    }
    public int getId()
    {
        return id;
    }
    public int getPhone()
    {
        return phone;
    }

    public void setName(String newvalue)
    {
        name=newvalue;
    }
    public void setCity(String newvalue)
    {
        city=newvalue;
    }
    public void setId(int newvalue)
    {
        id=newvalue;
    }
    public static void main(String args[])
    {
        Encapsulation e = new Encapsulation();
        e.setName("Janish");
        e.setCity("Mumbai");
        e.setId(100);
        System.out.println(e.getName());
        System.out.println(e.getCity());
        System.out.println(e.getId());
        System.out.println(e.getPhone());

    }


}
