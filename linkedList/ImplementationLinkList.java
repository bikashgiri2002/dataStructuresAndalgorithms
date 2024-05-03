package linkedList;

public class ImplementationLinkList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        Node(){
            this.data=0;
            this.next=null;
        }
    }
    static class linkedList{
        Node head=null;
        Node tail=null;
        int size =0;
        void insertAtEnd(int n){
            Node temp=new Node(n);
            if (head == null){
                head=temp;
            }
           else {
                tail.next=temp;
            }
            tail=temp;
           size++;
        }
        void display(){
            Node temp=head;
//            if(head == null){
//                return;
//            }
//            System.out.print(head.data+", ");
//            display(head.next);
            System.out.print("[");
            while(temp !=null ){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print("]");
            System.out.println();
        }
        void insertAtBeginning(int n){
            Node temp=new Node(n);
            temp.next=head;
            head=temp;
            size++;
        }
//        int size(){
//            Node temp=head;
//            int count =0;
//            while(temp != null){
//               count++;
//               temp=temp.next;
//            }
//            return count;
//        }
        void insertAtPosition(int index,int data){
            if (index==size-1){
                insertAtEnd(data);
                return;
            }
            if (index==0){
                insertAtBeginning(data);
                return;
            }
            Node tempInsert=new Node(data);
            Node temp=head;
            for (int i=0;i<index-1;i++){
                temp=temp.next;
            }
            tempInsert.next=temp.next;
            temp.next=tempInsert;
            size++;
        }
        int get(int index){
            if (index==0){
                return head.data;
            } else if (index == size-1) {
                return tail.data;
            }else if(index>=size){
                return -1;
            }
            Node temp=head;
            for (int i=0; i<index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAtIndex(int index){
            if (index == 0){
                head=head.next;
                size--;
                return;
            }
            else if (index >= size){
                System.out.println("Index is out of bound");
                return;
            }
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }

    public static void main(String[] args) {
        linkedList list =new linkedList();
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(9);
        list.display();
        list.display();
        System.out.println("Size "+list.size);
        list.insertAtBeginning(1);
        list.display();
        System.out.println("Size "+list.size);
        list.insertAtPosition(4,15);
        list.display();
        System.out.println("Size "+list.size);
        System.out.println(list.get(5));
        list.display();
        list.deleteAtIndex(4);
        list.display();
        System.out.println("Size "+list.size);
        list.deleteAtIndex(0);
        list.display();
        System.out.println("Size "+list.size);
        list.deleteAtIndex(3);
        list.display();
        System.out.println("Size "+list.size);
        list.deleteAtIndex(3);
    }
}
