package CollectionDemo;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("amol");
        ts.add("rohit");
        ts.add("mrityunjay");
        ts.add("venky");
        ts.add("gowthama");
        ts.add("pooja");
        ts.add("monica");
        ts.add("visha");
      //  ts.add(null); // does not allow
        System.out.println( ts.add("visha"));
        System.out.println(ts);

    }
}
