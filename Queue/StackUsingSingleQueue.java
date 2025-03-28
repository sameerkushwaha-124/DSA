package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue<T> {
    private Queue<T> queue;

    public StackUsingSingleQueue() {
        queue = new LinkedList<>();
    }

    // Push operation
    public void push(T item) {
        // Add the new item to the queue
        queue.add(item);

        // Rotate the queue to ensure the new item is at the front
        int size = queue.size();
        for (int i = 0; i < size - 1; i++) {
            queue.add(queue.poll());
        }
    }

    // Pop operation
    public T pop() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        StackUsingSingleQueue<Integer> stack = new StackUsingSingleQueue<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Expected: 3
        System.out.println(stack.pop()); // Expected: 2
        System.out.println(stack.pop()); // Expected: 1

        System.out.println("Size: " + stack.size()); // Expected: 0
    }
}
