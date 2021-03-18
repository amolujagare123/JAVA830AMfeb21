package CollectionDemo;

import java.util.ArrayDeque;

public class ArrayDQueueDemo {

    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(11);
        adq.offer(21);
        adq.offer(12);
        adq.offer(41);
        adq.offer(16);
        adq.offer(81);
        adq.offer(19);

        System.out.println(adq);

        adq.offerFirst(0);
        adq.offerLast(100);

        System.out.println(adq);

        adq.pollFirst();
        adq.pollLast();

        System.out.println(adq);

    }
}
