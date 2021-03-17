package CollectionDemo;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(23);
        s.push(13);
        s.push(33);
        s.push(23);
        s.push(43);
        s.push(22);

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);

        System.out.println(s.pop());

        System.out.println(s);
    }
}
