package CollectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet lhs = new LinkedHashSet();

        lhs.add(12);
        lhs.add(42);
        lhs.add(1.2);
        lhs.add('b');
        lhs.add("str");
        System.out.println(lhs.add(1.2));
        lhs.add(null);

        System.out.println(lhs);

    }
}
