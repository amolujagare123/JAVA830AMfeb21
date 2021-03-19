package CollectionDemo;

import java.util.HashMap;

public class HashMapDemo2 {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        System.out.println(hm.isEmpty()); // true

        hm.put(10,"amol");
        hm.put(21,"visha");
        hm.put(40,"venky");
        hm.put(12,"mritynjay");
        hm.put(5,"pooja");
        hm.put(6,"gowthama");
        System.out.println(hm.isEmpty()); // false

        System.out.println("hm="+hm);

        System.out.println(hm.get(20));

        hm.remove(40);

        System.out.println("hm="+hm);

        System.out.println(hm.containsKey(21)) ;
        System.out.println(hm.containsValue("pooja")) ;

        System.out.println(hm.size()); // 5

        hm.clear();
        System.out.println("hm="+hm);

    }
}
