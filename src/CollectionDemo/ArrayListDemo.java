package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add(12);
        al.add(32);
        al.add(13);
        al.add(42);
        al.add(42);
        al.add(4.2);
        al.add('b');
        al.add("amol");
        al.add(true);

        System.out.println(al);

        System.out.println(al.size());

        System.out.println("using for loop");
        for(int i=0; i<al.size();i++)
            System.out.println(al.get(i));

        System.out.println("using Iterator");

        Iterator itr = al.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());



    }
}
