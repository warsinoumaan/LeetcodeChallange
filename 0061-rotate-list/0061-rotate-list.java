/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Edge cases: empty list, single node, or no rotation
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        // Step 1: Find the length and the tail node
        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
        
        // Step 2: Handle k > length using modulo
        k = k % length;
        if (k == 0) {
            return head;
        }
        
        // Step 3: Make the list circular
        tail.next = head;
        
        // Step 4: Find the new tail (length - k - 1 steps from head)
        ListNode newTail = head;
        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }
        
        // Step 5: Break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;
        
        return newHead;
    }
}