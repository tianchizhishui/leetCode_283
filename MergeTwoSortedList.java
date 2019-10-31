/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);
        ListNode res = dummyNode;
        
        while (l1 != null && l2 != null) {
            if (l1.val >= l2.val) {
                dummyNode.next = new ListNode(l2.val);
                dummyNode = dummyNode.next;
                l2 = l2.next;
            } else {
                dummyNode.next = new ListNode(l1.val);
                dummyNode = dummyNode.next;
                l1 = l1.next;
            }
        }
        while (l1 == null && l2 != null) {
            dummyNode.next = new ListNode(l2.val); 
            dummyNode = dummyNode.next;
            l2 = l2.next;            
        }
        
        while (l2 == null && l1 != null) {
            dummyNode.next = new ListNode(l1.val);
            dummyNode = dummyNode.next;
            l1 = l1.next;
        }           
            
        return res.next;
    }
}