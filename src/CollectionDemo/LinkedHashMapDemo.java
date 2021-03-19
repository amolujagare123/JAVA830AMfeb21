package CollectionDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(10,"amol");
        lhm.put(21,"visha");
        lhm.put(40,"venky");
        lhm.put(12,"mritynjay");
        lhm.put(5,"pooja");
        lhm.put(6,"gowthama");

        System.out.println("hm="+lhm);


    }
}
