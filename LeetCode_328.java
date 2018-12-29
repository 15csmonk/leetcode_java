/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return head;
        ListNode odd = head;
        ListNode even = head.next;
        while(even != null && even.next != null){
            ListNode temp = odd.next;
            odd.next = even.next;
            even.next = even.next.next;
            odd.next.next = temp;
            even = even.next;
            odd = odd.next;
        }
        return head;
    }
}