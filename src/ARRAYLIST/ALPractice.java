package ARRAYLIST;

import java.util.ArrayList;

/**
 * Created by janish on 7/12/2017.
 */
public class ALPractice {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(10) ;

        list.add( "Andy" );
        list.add( "Bart" );
        list.add( "Carl" );
        list.add( 0, "Eve" );

        //list.set(list.indexOf("andy"),"janish");

        System.out.println(list.get(2));

        System.out.println(list.size());

        //list.clear();
    }
}
