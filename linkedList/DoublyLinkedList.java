package linkedList;

public class DoublyLinkedList {
    public static class DoublyNode{
        int data;
        DoublyNode next;
        DoublyNode prev;
        DoublyNode(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
   public static void display(DoublyNode head){
        DoublyNode temp = head;
        System.out.print("[ ");
        while (temp != null) {

            System.out.print(temp.data+", ");
            temp = temp.next;
        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        DoublyNode head = new DoublyNode(1);
        DoublyNode n1 = new DoublyNode(2);
        head.next = n1;
        n1.prev = head;
        DoublyNode n2 = new DoublyNode(3);
        n1.next = n2;
        n2.prev = n1;
        DoublyNode n3 = new DoublyNode(4);
        n3.prev = n2;
        n2.next = n3;
        DoublyNode tail = new DoublyNode(5);
        n3.next = tail;
        tail.prev = n3;
        display(head);
    }
}
