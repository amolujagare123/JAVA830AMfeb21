package CollectionDemo;

import java.util.HashMap;

public class HashMapDemo1 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(10,"amol");
        hm.put(21,"visha");
        hm.put(40,"venky");
        hm.put(12,"mritynjay");
        hm.put(5,"pooja");
        hm.put(6,"gowthama");

        System.out.println("hm="+hm);

        HashMap<Integer,String> hm1 = new HashMap<>();
        System.out.println("hm1="+hm1);
        hm1.putAll(hm);
        System.out.println("hm1="+hm1);


    }
}
