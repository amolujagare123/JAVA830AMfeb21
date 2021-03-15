package CollectionDemo;

import java.util.ArrayList;

public class ArrayListRemoveAll {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("amol");
        al.add("pooja");
        al.add("Mrityunjay");
        al.add("visha");
        al.add("Gowthama");

        System.out.println("al="+al);

        ArrayList<String> al2 = new ArrayList<>();

            al2.add("amol");
            al2.add("pooja");
            al2.add("Mrityunjay");
            al2.add("abc1");
            al2.add("abc2");
            al2.add("abc3");

        System.out.println("al2="+al2);
        al2.removeAll(al);
        // the elements present in al which are there in al2 are removed

        System.out.println("al2="+al2);


    }
}
