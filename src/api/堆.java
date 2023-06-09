package api;

import java.util.Iterator;
import java.util.Stack;

public class 堆 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.println(stack.pop());
        }
    }
}
