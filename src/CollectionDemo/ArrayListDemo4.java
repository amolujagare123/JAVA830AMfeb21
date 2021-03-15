package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("amol");
        al.add("pooja");
        al.add("Mrityunjay");
        al.add("visha");
        al.add("Gowthama");

        System.out.println("al="+al);

        al.remove(1);

        al.remove("visha");

        System.out.println("al="+al);







    }
}
