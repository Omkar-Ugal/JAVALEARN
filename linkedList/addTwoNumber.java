package linkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);  // A dummy node to simplify the code.
        ListNode p = l1, q = l2, current = dummyHead;
        int carry = 0;

        // Iterate through both lists while there are still nodes or a carry
        while (p != null || q != null || carry != 0) {
            int x = (p != null) ? p.val : 0;  // If p is not null, get its value, otherwise 0
            int y = (q != null) ? q.val : 0;  // If q is not null, get its value, otherwise 0
            
            int sum = x + y + carry;  // Add the values and the carry
            carry = sum / 10;  // Update the carry for the next iteration
            current.next = new ListNode(sum % 10);  // Create a new node with the digit (sum % 10)
            current = current.next;  // Move the pointer to the new node
            
            // Move the pointers in l1 and l2 if possible
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        // Return the next of dummyHead, which is the actual start of the result list
        return dummyHead.next;
    }
}

public class addTwoNumber{
    public static void main(String[] args) {
        // Example 1:
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution sol = new Solution();
        ListNode result = sol.addTwoNumbers(l1, l2);

        // Print the result list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: [7, 0, 8]

        System.out.println();
        
        // Example 2:
        l1 = new ListNode(0);
        l2 = new ListNode(0);
        result = sol.addTwoNumbers(l1, l2);

        // Print the result list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Output: [0]
    }
}

