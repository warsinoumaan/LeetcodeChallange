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


ListNode findMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public void reorderList(ListNode head) {

          if (head == null || head.next == null) {
            return;
        }
 
            ListNode mid  = findMiddle(head);
        ListNode temp = head;
        while (temp.next != mid){
            temp = temp.next;
        }
        temp.next = null;

        ListNode newhead = reverse(mid);

    ListNode temp1 = head;
    ListNode temp2 = newhead;

        while (temp1 != null && temp2 != null) {
            ListNode next1 = temp1.next;
            ListNode next2 = temp2.next;
            temp1.next = temp2;
            temp2.next = next1;
            temp1 = next1;
            temp2 = next2;
        }
        if (temp2 != null) {
    temp1 = head;

    while (temp1.next != null) {
        temp1 = temp1.next;
    }

    temp1.next = temp2;
}
        
        
    }
}