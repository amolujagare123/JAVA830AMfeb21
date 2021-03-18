package CollectionDemo;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add(12);
        hs.add(42);
        hs.add(1.2);
        hs.add('b');
        hs.add("str");
        System.out.println(hs.add(1.2));
        hs.add(null);

        System.out.println(hs);

    }
}
