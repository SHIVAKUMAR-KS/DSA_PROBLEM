package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();

    //to add new element in the stack
    //time complexity: O(n)
    static void add(int data){
        //1.move all the element from q1 to q2
        while (!q1.isEmpty()){
            q2.add(q1.peek());
            //poll method is also used to remove the element from the queue
            //it return nill when queue is empty
            q1.poll();
        }

        //2.push the new data to q1
        q1.add(data);

        //3.move back all the element from q2 to q1
        while (!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    //to delete the element from the stack
    //time complexity: O(1)
    static int remove(){
        if(q1.isEmpty()){
            System.out.println("Queue underflow");
            System.exit(0);
        }
        int ele =q1.peek();
        q1.poll();
        return ele;
    }
    public static void main(String[] args) {
            stackUsingQueue s=new stackUsingQueue();
            s.add(2);
            s.add(5);
            s.add(9);
            s.add(12);

            //remove all the element from the stack
        //LIFO _ Last in first out
        System.out.println("Deleted element from the staack is "+s.remove());
        System.out.println("Deleted element from the staack is "+s.remove());

    }
}
