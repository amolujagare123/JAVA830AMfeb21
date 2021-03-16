package CollectionDemo;

import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.add("abc1");
        ls.add("abc2");
        ls.add("abc3");
        ls.add("abc4");
        ls.add("abc5");
        ls.add("abc6");

        System.out.println(ls);

        ls.addFirst("FirstElement");
        ls.addLast("LastElement");

        System.out.println(ls);

        ls.removeFirst();
        ls.removeLast();

        System.out.println(ls);


    }
}
