package linkedList;

public class FindNodeWhereCycleBegins {
    static Node findCycle(Node head){
        Node slow = head;
        Node fast = head;
        Node temp = head;
        if ( head == null && head.next == null){
            return null;
        }
        while (fast != null){
            slow = slow.next;
            if (fast.next == null){
                return null;
            }
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }
        while (temp != slow){
            slow = slow.next;
            temp = temp.next;
        }
        return slow;
    }
    static int findLength(Node head){
        int length = 1;
        Node slow = head;
        Node fast = head;
        Node temp = head;
        if ( head == null){
            return 0;
        }
        while (fast != null){
            slow = slow.next;
            if (fast.next == null){
                break;
            }
            fast = fast.next.next;
            if (slow == fast){
                break;
            }
        }
        while (temp != slow){
            slow = slow.next;
            temp = temp.next;
            length++;
        }
        temp = temp.next;
        while (temp != slow){
            temp = temp.next;
            length++;
        }
        return length;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node a = new Node(11);
        head.next = a;
        Node b = new Node (12);
        a.next = b;
        Node c = new Node (13);
        b.next = c;
        Node d = new Node (14);
        c.next = d;
        Node e = new Node (15);
        d.next = e;
        e.next = b;
        Node intersection = findCycle(head);
        if (intersection == null){
            System.out.println("No Cycle");
        }
        else {
            System.out.println("Cycle Start At "+intersection.data);
        }
        System.out.println(findLength(head));
    }
}
