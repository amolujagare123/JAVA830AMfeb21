package CollectionDemo;

import java.util.ArrayList;

public class ArrayListStringsRemoveIf {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pooja");
        al.add("Mrityunjay");
        al.add("visha");
        al.add("Gowthama");
        al.add("Venky");
        al.add("Monica");
        al.add("Rohit");
        al.add("Ganesh");


        // remove all the elements which ends with 'a'
        // remove all the elements which starts with 'M'
        // remove all the elements whose length is greater than 5
        //----------------------------------------------
        // String str ="abcda"; | str.endsWith("a"); -> true /false

        System.out.println(al);
       // al.removeIf(str -> str.endsWith("a"));
       // al.removeIf(str -> str.startsWith("M"));

        al.removeIf(str -> str.length()>5);

        System.out.println(al);




    }
}
