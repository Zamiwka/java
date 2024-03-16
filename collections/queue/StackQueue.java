package collections.queue;

import java.util.*;

public class StackQueue {
    public static void main(String[] args) {
        Stack<Integer>stack1 = new Stack<>();
        stack1.add(5);
        stack1.add(0);
        stack1.add(6);
        stack1.add(9);
        System.out.println(stack1);
        System.out.println(stack1.pop());
        System.out.println(stack1);

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(0);
        queue.add(6);
        queue.add(9);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(0);
        deque.add(6);
        deque.add(9);
        System.out.println(deque);
        System.out.println(deque.pop());
        System.out.println(deque);
    }
}
