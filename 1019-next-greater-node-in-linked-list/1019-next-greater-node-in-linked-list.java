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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> s = new Stack<>();

        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        
        int n = list.size();
        int[] ans = new int [n];
        s.push(0);
        ans[n-1] = 0;
        for(int i = 1; i<n;i++){
            while(!s.isEmpty()&& list.get(i)> list.get(s.peek())){
                ans[s.pop()] = list.get(i);
            }
            s.push(i);
        }

        return ans;
    }
}