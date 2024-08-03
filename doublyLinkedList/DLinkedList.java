package doublyLinkedList;

import linkedList.DoublyLinkedList;

public class DLinkedList {
    public static class DoubleNode{
        int data;
        DoubleNode next;
        DoubleNode prev;
        DoubleNode(int data){
            this.data = data;
        }
    }
    public static DoubleNode addAt(int data ,DoubleNode head){
        DoubleNode t = new DoubleNode(data);
        t.next = head;
        head.prev = t;
        return t;
    }
}
