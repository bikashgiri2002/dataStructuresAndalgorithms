package linkedList;

public class DeleteMiddleElement {
   static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node() {
            this.data = 0;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(2);
        Node b=new Node(3);
        head.next=b;
        Node c=new Node(4);
        b.next=c;
        Node d= new Node(5);
        c.next=d;
        Node e=new Node(25);
        d.next=e;
        Node f =new Node(24);
        e.next=f;
    }
}
