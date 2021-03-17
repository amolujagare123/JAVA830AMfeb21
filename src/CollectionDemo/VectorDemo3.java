package CollectionDemo;

import java.util.Vector;

public class VectorDemo3 {

    // For vector - default initial capacity is - 10

    public static void main(String[] args) {

        Vector<String> v = new Vector<>(7,3);

        System.out.println("size="+v.size());// 0
        System.out.println("Capacity="+v.capacity());// 7

        v.add("abc1");
        v.add("abc2");
        v.add("abc3");
        v.add("abc4");
        v.add("abc5");
        v.add("abc6");
        v.add("abc1");
        v.add("abc1");

        System.out.println("size="+v.size());// 8
        System.out.println("Capacity="+v.capacity());// 10

        System.out.println(v);


    }
}
