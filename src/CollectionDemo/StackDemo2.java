package CollectionDemo;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(23); // 0 | 6
        s.push(13); // 1 | 5
        s.push(33); // 2 | 4
        s.push(23); // 3 | 3
        s.push(43); // 4 | 2
        s.push(22); // 5 | 1

        System.out.println(s);


        System.out.println(s.search(22));



    }
}
