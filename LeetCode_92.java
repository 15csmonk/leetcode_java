/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i = 0; i < m - 1; i ++)
            prev = prev.next;
        ListNode head2 = prev;
        prev = head2.next;
        ListNode cur = prev.next;
        for(int i = m; i < n; i ++){
            prev.next = cur.next;
            cur.next = head2.next;
            head2.next = cur;
            cur = prev.next;
        }
        return dummy.next;
    }
}
