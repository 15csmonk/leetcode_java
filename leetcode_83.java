package com.leetcode;

//Definition for singly-linked list.
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(head != null && head.next != null){
            while(head.next != null && head.val == head.next.val){
                head.next = head.next.next;
            }
            head = head.next;
        }
        return cur;
    }
}