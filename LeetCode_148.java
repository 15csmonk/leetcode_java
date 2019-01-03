/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        int count = 0;
        while(cur != null){
            cur = cur.next;
            count ++;
        }
        int num[] = new int[count];
        int i = 0;
        while(head != null){
            num[i] = head.val;
            head = head.next;
            i ++;
        }
        Arrays.sort(num);
        ListNode res = new ListNode(num[0]);
        ListNode now = res;
        for(int j = 1; j < num.length; j ++){
            now.next = new ListNode(num[j]);
            now = now.next;
        }
        return res;
    }
}