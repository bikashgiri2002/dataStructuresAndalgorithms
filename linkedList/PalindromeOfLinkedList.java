package linkedList;

public class PalindromeOfLinkedList {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if(slow.next == null){
            return true;
        }
        if(fast.next.next == null){
            return (fast.val == fast.next.val)?true:false;
        }
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        ListNode node = slow;
        while( mid != null){
            ListNode temp = mid.next;
            mid.next = node;
            node = mid;
            mid = temp;
        }
        while(node != slow){
            if(head.val != node.val){
                return false;
            }
            head = head.next;
            node = node.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode a = new ListNode(2);
        head.next = a;
        ListNode b = new ListNode(2);
        a.next = b;
        ListNode c = new ListNode(1);
        b.next = c;
        System.out.println(isPalindrome(head));

    }
}
