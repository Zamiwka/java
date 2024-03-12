package collections.lists;

import java.util.Stack;
import java.util.Vector;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.pop());
       // Stack   vs     Vector
        // push/pop       index acces
        // not synhronized
        Vector<Integer> vector = new Vector<>();
        vector.add(33);
        vector.add(40);
        vector.add(32);
        System.out.println(vector);
        System.out.println(vector.get(2));




    }
}
