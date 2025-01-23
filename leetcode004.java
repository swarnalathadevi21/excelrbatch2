// Solution class
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to store the result
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Traverse both lists
        while (l1 != null || l2 != null || carry != 0) {
            // Get the current values from l1 and l2, if available
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Sum the values and the carry
            int sum = val1 + val2 + carry;

            // Update the carry for the next iteration
            carry = sum / 10;

            // Set the current node's next value to the single digit sum (sum % 10)
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to the next nodes in l1 and l2
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // Return the result (skip the dummy head)
        return dummyHead.next;
    }

    public static void main(String[] args) {
        // Example 1: l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);
        
        // Output the result
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
        // Expected output: 7 0 8
    }
}
