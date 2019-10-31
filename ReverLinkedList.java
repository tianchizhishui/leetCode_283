Solution 1: forwards

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
        ListNode pre = null;
        ListNode temp = null;
        
        while (head != null) {
            temp = head.next;
            head.next = pre;
            pre = head; 
            head = temp;
        }
        
        return pre;
    }
}


Solution 2: backwards:

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
        ListNode dummy = new ListNode(0);
        
        while (head != null) {
            dummy.val = head.val;
            ListNode revHead = new ListNode(0);
            revHead.next = dummy;
            dummy = revHead;
            head = head.next;
        }
        return dummy.next; 
    }
}