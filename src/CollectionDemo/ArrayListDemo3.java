package CollectionDemo;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(12);// 0
        al.add(32); // 1
        al.add(13); // 2
        al.add(42); // 3
        al.add(41);// 4

        System.out.println("al="+al);

        al.remove(13);

        al.remove(new Integer(13));

        // boxing / wrapping --> 13 (premitive) -> non primitive (Object)


        System.out.println("al="+al);








    }
}
