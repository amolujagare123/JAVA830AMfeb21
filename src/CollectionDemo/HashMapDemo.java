package CollectionDemo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap hm = new HashMap();

        hm.put(10,"amol");
        hm.put(21,"visha");
        hm.put(40,"venky");
        hm.put(12,"mritynjay");
        hm.put(5,"pooja");
        hm.put(6,"pooja");

        hm.put(6,"abcd");
        hm.put(6.6,"abcd");
        hm.put("amol",'b');
        hm.put(true,"abcd");
        hm.put(7,null);
        hm.put(8,null);
        hm.put(9,null);

        hm.put(null,"abcd1");
        hm.put(null,"abcd2");

        hm.put(null,null);

        System.out.println(hm);

    }
}
