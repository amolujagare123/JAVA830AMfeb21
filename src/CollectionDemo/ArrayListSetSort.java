package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSetSort {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();


        
        al.add("Amol");
        al.add("Pooja");
        al.add("Mrityunjay");
        al.add("Visha");
        al.add("Gowthama");



        System.out.println("al="+al);

        Collections.sort(al);

        System.out.println("al="+al);




        al.set(1,"abc");

        System.out.println("al="+al);

    }
}
