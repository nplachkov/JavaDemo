package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Person1"); //adds an element at the end of the queue
        queue.offer("Person2"); //adds an element at the end of the queue
        queue.offer("Person3"); //adds an element at the end of the queue

        System.out.println(queue); //prints the whole queue
        System.out.println(queue.poll()); //takes out the first arrival
        System.out.println(queue); //prints the remaining queue
    }
}
