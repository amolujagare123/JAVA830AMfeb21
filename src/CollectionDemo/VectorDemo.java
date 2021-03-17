package CollectionDemo;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("abc1");
        v.add("abc2");
        v.add("abc3");
        v.add("abc4");
        v.add("abc5");
        v.add("abc6");

        System.out.println(v);

        System.out.println(v.contains("abcd")); // false

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        /*Enumeration e = v.elements();
        while(e.hasMoreElements())
            System.out.println(e.nextElement());

        */

     Object[] o  =  v.toArray(); // it rerun an array of Object

     // String[] str
//      int[] a


     for(int i=0; i<o.length;i++)
         System.out.println(o[i]);

    }
}
