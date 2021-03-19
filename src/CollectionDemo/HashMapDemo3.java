package CollectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo3 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(10,"amol");
        hm.put(21,"visha");
        hm.put(40,"venky");
        hm.put(12,"mritynjay");
        hm.put(5,"pooja");
        hm.put(6,"gowthama");

        System.out.println("hm="+hm);

        Set s =   hm.keySet();
        System.out.println("Set Keys = "+ s);

       Collection c =  hm.values();
        System.out.println("values = "+ c);

        Set entrySet = hm.entrySet();
        System.out.println("Entry Set = "+ entrySet);

    }
}
