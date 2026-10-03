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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;

        while (true) {
  ListNode check = curr;

            for (int i = 0; i < k; i++) {

                if (check == null) {
                    return head;
                }

                check = check.next;
            }
            ListNode last = prev;
            ListNode newend = curr;

            for (int i = 0; curr != null && i < k; i++) {

                ListNode next = curr.next;

                curr.next = prev;

                prev = curr;

                curr = next;
            }

         
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

          
            newend.next = curr;

            if (curr == null) {
                break;
            }

            prev = newend;
        }

        return head;
    }
}