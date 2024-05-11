package linkedList;

public class IntersectionOfTwoLinkedList {
    static class Node {
        int data;
        ImplementationLinkList.Node next;

        Node(int data) {
            this.data = data;
        }

        Node() {
            this.data = 0;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Node head1=new Node(100);
        Node head2=new Node(90);
    }
}