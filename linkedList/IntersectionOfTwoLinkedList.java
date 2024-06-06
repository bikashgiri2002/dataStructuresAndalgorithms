package linkedList;

public class IntersectionOfTwoLinkedList {
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
    // my own solution time complexity O(n^2)
    static Node findIntersection(Node head1,Node head2){
        Node temp1=head1;
        while(temp1.next != null){
            Node temp2=head2;
           while(temp2.next != null){
               if (temp1 == temp2){
                   return temp1;
               }else {
                   temp2=temp2.next;
               }
           }
           temp1=temp1.next;
        }
        return null;
    }
    //class solution time complexity O(n)
    static Node findByLength(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        int length1 = 0 , length2 = 0;
        while(temp1 != null){
            length1++;
            temp1 = temp1.next;
        }
        while (temp2 != null){
            length2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;
        if (length1 >= length2){
            for (int i = 0; i< length1 - length2 ; i++){
                temp1=temp1.next;
            }
        }
        else{
            for (int i =0 ; i< length2 - length1; i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }

    public static void main(String[] args) {
        Node head1=new Node(100);
        Node a=new Node(13);
        head1.next=a;
        Node b=new Node(4);
        a.next=b;
        Node c=new Node(5);
        b.next=c;
        Node d=new Node(12);
        c.next=d;
        Node e=new Node(10);
        d.next=e;
        Node head2=new Node(90);
        Node a1=new Node(9);
        head2.next=a1;
        a1.next=c;
        System.out.println(c.next);
        Node intersection=findIntersection(head2,head1);
        if (intersection==null){
            System.out.println("no intersection");
            return;
        }
        System.out.println(intersection.data+"\n"+intersection.next);
        Node intersection1 = findByLength(head1,head2);
        if (intersection1==null){
            System.out.println("no intersection");
            return;
       }
        System.out.println(intersection1.data+"\n"+intersection1.next);
    }
}