package CollectionDemo;

import java.util.PriorityQueue;

public class PriorityQueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(23);
        pq.offer(13);
        pq.offer(43);
        pq.offer(22);
        pq.offer(53);
        pq.offer(25);
        pq.offer(63);

        System.out.println(pq);

        // [13, 22, 23, 25, 43, 53, 63]

        // some operating system / complier doesnot support priority queue
        // so the out put may be be seen in order
        // but internally it is stored in an order

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());





    }

}
