/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode res = head;
        int count = 1;
        while(fast.next != null){
            fast = fast.next;
            count ++;
        }
        k %= count;
        for(int i = 0; i < count - k - 1; i ++){
            slow = slow.next;
        }
        fast.next = res;
        res = slow.next;
        slow.next = null;
        return res;
    }
}