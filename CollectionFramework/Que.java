package CollectionFramework;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Que {
    public static void main(String[] args) {
        Queue<Integer> qu = new PriorityQueue<>();
        qu.add(1);
        qu.add(2);
        qu.add(3);
        System.out.println(qu);

        Queue<Integer> qu1 = new LinkedList<>();
        qu1.add(1);
        qu1.add(2);
        qu1.add(3);
        System.out.println(qu1);

        Queue<Integer> qu2 = new ArrayDeque<>();
        qu2.add(1);
        qu2.add(2);
        qu2.add(3);
        System.out.println(qu2);
        /*add(E e): Adds an element to the queue.
poll(): Retrieves and removes the head of the queue.
peek(): Retrieves, but does not remove, the head of the queue. */
    }
}
