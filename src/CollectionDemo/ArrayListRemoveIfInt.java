package CollectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListRemoveIfInt {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList();

        al.add(121);//
        al.add(321);
        al.add(137);//
        al.add(423);
        al.add(426);
        al.add(112);//
        al.add(422);
        al.add(402);
        al.add(542);
        al.add(442);
        al.add(412);

        System.out.println(al);

        // remove elements which are less than 200
        //---------------------------------------------
        // removeIf():it removes elements based on some condition
        // inside remove if - first identify the type of the list
        // consider any variable wit it inside removeIf
        // this variable will be of same type as that of list

        // syntax : list.removeIf(var -> condition)
        // '->' : predicate symbol

        al.removeIf(a -> a<200 );

        System.out.println(al);

    }
}
