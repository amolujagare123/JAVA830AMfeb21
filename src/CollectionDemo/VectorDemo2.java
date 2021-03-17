package CollectionDemo;

import java.util.Vector;

public class VectorDemo2 {

    // For vector - default initial capacity is - 10

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        System.out.println("size="+v.size());// 0
        System.out.println("Capacity="+v.capacity());// 10

        v.add("abc1");
        v.add("abc2");
        v.add("abc3");
        v.add("abc4");
        v.add("abc5");
        v.add("abc6");
        v.add("abc1");
        v.add("abc2");
        v.add("abc3");
        v.add("abc4");
        v.add("abc4");

        System.out.println("size="+v.size());// 11
        System.out.println("Capacity="+v.capacity());// 20

        System.out.println(v);


    }
}
