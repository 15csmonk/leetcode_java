/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow =slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next = null;
        ListNode last = mid;
        ListNode pre = null;
        while(last != null){
            ListNode next = last.next;
            last.next = pre;
            pre = last;
            last = next;
        }
        while(pre != null){
            if(head.val != pre.val){
                return false;
            }
            head = head.next;
            pre = pre.next;
        }
        return true;
    }
}