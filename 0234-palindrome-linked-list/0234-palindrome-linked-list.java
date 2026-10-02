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

private ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }




    public boolean isPalindrome(ListNode head) {
         ListNode mid = findMiddle(head);
     ListNode headSecondhalf = reverse(mid);
     ListNode rereverseHead  = headSecondhalf;

     // compare both halves
        while (head!= null && headSecondhalf != null) {
            if (head.val!=headSecondhalf.val) {
                return false;
            }
            head = head.next;
            headSecondhalf = headSecondhalf.next;
        }
     reverse(rereverseHead);
      return(true);
    }
}