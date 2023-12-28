/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
     
        int carry = 0;

        ListNode root = new ListNode();

        ListNode current = root;
        
        while(l1 != null || l2 != null){
            
            int v1 =  l1 == null ? 0 : l1.val;

            int v2 =  l2 == null ? 0 : l2.val;
            

            int sum = v1 + v2 + carry;

            current.val = sum % 10;

            
            l1 = l1 == null ? null : l1.next ;
            l2 = l2 == null ? null : l2.next ;

            carry = sum / 10;

            if(l1 == null && l2 == null && carry ==0){
                current.next = null;     
            } 
            else {
                current.next = new ListNode(carry); 
            }

            current = current.next;

        }

        return root;

    }
}
// @lc code=end

