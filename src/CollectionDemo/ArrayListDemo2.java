package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);
        al.add(32);
        al.add(13);
        al.add(42);
        al.add(42);
       /* al.add(4.2);
        al.add('b');
        al.add("amol");
        al.add(true);
*/
        System.out.println("al="+al);


        ArrayList<Integer> al2 = new ArrayList<>();

        System.out.println("al2="+al2);
        al2.addAll(al);
        System.out.println("al2="+al2);










    }
}
