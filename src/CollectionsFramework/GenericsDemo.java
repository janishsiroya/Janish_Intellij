package CollectionsFramework;

import java.util.ArrayList;

/**
 * Created by janish on 5/31/2017.
 */

class Container<T extends Number> //creating your own generics
    {
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }
}
public class GenericsDemo {
    public static void main(String args[]){
        Container<Double> obj = new Container<>();
        obj.value=9.9;
        obj.show();

    }
}
