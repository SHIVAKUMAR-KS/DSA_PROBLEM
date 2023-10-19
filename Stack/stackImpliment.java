package Stack;

import java.util.Stack;
/*
push()
pop()
peak()
search()
empty()

 */
public class stackImpliment {
    public static void main(String[] args) {
        //create a object for stack
        Stack<Integer> stack1=new Stack<>();

        //push the element inside the stack
        stack1.push(2);
        stack1.push(4);
        stack1.push(6);
        stack1.push(9);

        //print the topmost element in the stack
        System.out.println("The topmost element in the stack before deletion is: "+stack1.peek());
        System.out.println(stack1);

        //delete the top element from the stack
        stack1.pop();


        //print the topmost element in the stack
        System.out.println("The topmost element in the stack after deletion is: "+stack1.peek());

        //search an element in the stack
        //search function return -1 when the element is not present in the stack
        System.out.println("Element 1 is present at the position:"+stack1.search(1));
        System.out.println("Element 4 is present at the position:"+stack1.search(4));

        //check whether the stack is empty or not
        //empty function return the boolean value (true/false)
        System.out.println("Is stack empty or not :"+stack1.empty());

    }
}
/* Output
The topmost element in the stack before deletion is: 9
[2, 4, 6, 9]
The topmost element in the stack after deletion is: 6
Element 1 is present at the position:-1
Element 4 is present at the position:2
Is stack empty or not :false

 */