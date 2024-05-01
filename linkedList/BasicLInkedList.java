package linkedList;

public class BasicLInkedList {
     static class Node{
         int data;
         Node next;
         Node(int data){
             this.data=data;
         }
     }
     public static void display(Node head){
         if(head == null){
             return;
         }
         System.out.print(head.data+", ");
         display(head.next);
     }


    public static void main(String[] args) {
        Node head=new Node(2);
        System.out.println(head.next);
        Node b=new Node(3);
        head.next=b;
        System.out.println(head.next);
        Node c=new Node(4);
        b.next=c;
        Node d= new Node(5);
        c.next=d;
        Node e=new Node(25);
        d.next=e;
        Node temp=head;
        //display link list using while loop
        while(temp != null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println();
        //display using recursion
        display(head);
        System.out.println();
        display(head);

    }
}
