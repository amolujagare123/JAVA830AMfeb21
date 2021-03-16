package CollectionDemo;

import java.util.ArrayList;

public class ArrayListClearSet {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println(al.isEmpty());// true

        al.add("amol");
        al.add("pooja");
        al.add("Mrityunjay");
        al.add("visha");
        al.add("Gowthama");

        System.out.println(al.isEmpty());// false

        System.out.println("al="+al);

        al.clear();

        System.out.println("al="+al);


    }
}
