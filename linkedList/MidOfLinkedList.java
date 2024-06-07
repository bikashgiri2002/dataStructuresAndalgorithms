package linkedList;

public class MidOfLinkedList {
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
    static Node findMidTwoIteration(Node head){
        Node temp = head;
        int n=0;
        while (temp.next != null){
            n++;
            temp=temp.next;
        }
        temp=head;
         n=n/2;
         for (int i=0; i<n; i++){
             temp=temp.next;
         }
         return temp;
    }
    static Node findMidOneIteration(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        System.out.println(findMidTwoIteration(head).data);
        System.out.println(findMidOneIteration(head).data);
    }
}
