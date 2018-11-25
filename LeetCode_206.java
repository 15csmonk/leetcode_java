/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode pre = head;
        ListNode p = head.next;
        pre.next = null;
        ListNode n;
        while(p != null){
            n = p.next;
            p.next = pre;
            pre = p;
            p = n;
        }
        return pre;
    }
}
