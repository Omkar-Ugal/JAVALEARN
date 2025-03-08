package linkedList;

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode slow = head;
      ListNode fast = head;
  
      while (n-- > 0)
        fast = fast.next;
      if (fast == null)
        return head.next;
  
      while (fast.next != null) {
        slow = slow.next;
        fast = fast.next;
      }
      slow.next = slow.next.next;
  
      return head;
    }
  }
public class removeNthFromEnd {
    public static void main(String[] args) {
        
    }
}
