package LinkedList;

class SingleLL {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    // insert the node at the very end in the linked list
    public void insertAtEnd(int newData){
        // intialize the newNode with the newData entered by the user
        Node newNode = new Node(newData);

        // LinkedList is empty
        if(head == null){
            head = new Node(newData);
            return;
        }

        // LinkedList is not empty
        newNode.next = null;
        // traversing the linkedlist at the end of the node
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        return;
    }

    //Implimenting of insertion of a node at the beginning
    public void insertAtBeginning(int newData){
        Node newNode=new Node( newData);
        newNode.next=head;
        head=newNode;

    }

    //Implimenting od insertion of a node after any node
    public void insertAfter(Node prev_node,int newData){
        if(prev_node ==null){
            System.out.println("The Previous node cannot contain the null values");
            return;
        }
        Node newNode =new Node(newData);
        newNode.next =prev_node.next;
        prev_node.next=newNode;
    }
    //Implimentation of deletion of a node in a linked list
    void deleteNode(int pos){
        //linkedlsit is empty
        if(head==null){
            return;
        }
        Node temp =head;
        //deletion is in  the beginning of the node
        if(pos ==0){
            head=temp.next;
            return;
        }
        //deletion is not in the beginning of the node
        for (int i = 0; temp!=null && i<pos-1;i++) {
            temp=temp.next;
        }

        if(temp ==null && temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }

     //implimentation of reversal by iterative  of a node in a linked list
    public void reverseLL(){
        Node curr =head;
        Node prev =null;
        Node nextPtr=null;

        while(curr!=null){
                nextPtr =curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextPtr;
        }
        head=prev;
        return;
    }

    //Implimentation of reversal of a linked liat using recursive approach
    public void revrsalRec(Node curr,Node prev){
        //last node of a linked list
        if(curr.next==null){
            head=curr;
            curr.next=prev;
            return;
        }
        Node nextPtr =curr.next;
        curr.next=prev;
        //recursive function call
        revrsalRec(nextPtr,curr);
    }


    //Implimentation of finding of middle data in a linked list
    //Two pointer approach
    public void middleNode(){
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println("Middle data of a given linked list is "+slow.data);
    }

    //implimentation of detecting the loop in a linked list
    //floyds cycle detection algorithm
    public void delectLoop(){
        Node slow=head,fast=head;
        int flag=0;
        while(slow!=null && fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("No loop detected");
        }else{
            System.out.println("Loop is detected");
        }
    }


    // display all the nodes after the insertion
    public void displayLL(){
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;

        }
    }

    public static  void main(String[] args) {
        SingleLL llist = new SingleLL();

        // function calling
        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(8);
        llist.insertAtEnd(10);
        llist.insertAtEnd(15);
        llist.insertAtEnd(56);

        System.out.println("Before insertion of 10,1,and 19");
        llist.displayLL();
        System.out.println();

        llist.insertAtBeginning(10);
        llist.insertAtBeginning(1);
        llist.insertAtBeginning(19);

        System.out.println("After insertion of 10,1 and 19");
        llist.displayLL();
        System.out.println();

        llist.insertAfter(llist.head.next.next.next,13);
        System.out.println("After insert at after");
        llist.displayLL();
        System.out.println();


     /*   llist.deleteNode(0);
        System.out.println("Deletion of a node from a linked list");
        llist.displayLL();
        System.out.println();
        */

        //llist.reverseLL();//it is used for iterative reverse
        //llist.revrsalRec(llist.head,null);//it is for by recursive approach
        //System.out.println("Reversal in a linked list:");
        //llist.displayLL();
        //llist.middleNode();

        //circular linked list

        Node temp= llist.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=llist.head;


        llist.delectLoop();
        System.out.println();



    }
}
