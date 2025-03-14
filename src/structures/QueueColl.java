package structures;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueColl {

    public static Queue<Integer> deleteElementQueue(Queue<Integer> queue){
      queue.poll();
      queue.poll();
      queue.poll();
      return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(2,5,20,30,56));
        Queue<Integer> result = deleteElementQueue(queue);
        System.out.println(result);


    }
}
