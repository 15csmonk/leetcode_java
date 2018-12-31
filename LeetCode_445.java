/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        while(l1 != null){
            s1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            s2.push(l2.val);
            l2 = l2.next;
        }
        int sum = 0;
        ListNode res = new ListNode(0);
        while(!s1.empty() || !s2.empty()){
            if(!s1.empty()){
                sum += s1.pop();
            }
            if(!s2.empty()){
                sum += s2.pop();
            }
            ListNode carry = new ListNode(sum / 10);
            res.val = sum % 10;
            carry.next = res;
            res = carry;
            sum /= 10;
        }
        if (res.val == 0)
			res = res.next;
		return res;
    }
}