package linkedList;

public class NthNodeFromLast {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    //create a function to do so
    static Node nthNodeFromLast(Node head,int n){
        Node temp=head;
        int size=0;
        while(temp != null){
            size++;
            temp=temp.next;
        }
        temp=head;
        for (int i=0; i<size-n;i++){
            temp=temp.next;
        }
        return temp;
    }
    //using slow and fast and one traversing
    static Node nthFromLast(Node head,int n){
        Node slow=head;
        Node fast=head;
        for (int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast != null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    //delete nth node from last
    static void deleteNthFromLast(Node head,int n){
        Node slow=head;
        Node fast=head;
        for (int i=0; i<n;i++){
            fast=fast.next;
        }
        while(fast.next != null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=fast;
    }
    //display function
    static void display(Node head){
        Node temp=head;
        System.out.print("[");
        while(temp.next != null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        //create a linked list
        Node head=new Node(1);
        Node b=new Node(2);
        head.next=b;
        Node c=new Node(3);
        b.next=c;
        Node d=new Node(4);
        c.next=d;
        Node e=new Node(5);
        d.next=e;
        Node f=new Node(12);
        e.next=f;
        Node g=new Node(10);
        f.next=g;
        display(head);
        //let n=2
        int n=2;
        //2 traversing
        System.out.println(nthNodeFromLast(head,n).data);
        //1 traversing
        System.out.println(nthFromLast(head,n).data);
        deleteNthFromLast(head,n);
        display(head);
    }
}
