package queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseAQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        int[] arr = new int[queue.size()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = queue.poll();
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            queue.add(arr[i]);
        }
        System.out.println(queue);
    }
}
