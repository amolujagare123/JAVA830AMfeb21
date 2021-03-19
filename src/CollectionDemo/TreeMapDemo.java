package CollectionDemo;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> tm = new TreeMap<>();

        tm.put(10,"amol");
        tm.put(21,"visha");
        tm.put(40,"venky");
        tm.put(12,"mritynjay");
        tm.put(5,"pooja");
        tm.put(6,"gowthama");

        System.out.println("hm="+tm);


    }
}
