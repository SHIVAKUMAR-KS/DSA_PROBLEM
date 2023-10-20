package Queue;
//implimentation of the function available in the queue data structure in java

import java.util.LinkedList;
import java.util.Queue;

public class queueImpliment {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        //to add the data inside the queue
        for (int i = 0; i < 10; i++) {
            q.add(i);
        }
        System.out.println("Queue data looks like :"+q);

        //to display the top element present in the queue
        System.out.println("The top element in the queue before deletion is :"+q.peek());

        //to remove the element from the queue -dequeue
        q.remove();

        //to display the top element present in the queue
        System.out.println("The top element in the queue after deletion is :"+q.peek());

        //to check the size of the queue
        System.out.println("The current size of the queue is :"+q.size());

    }


}
