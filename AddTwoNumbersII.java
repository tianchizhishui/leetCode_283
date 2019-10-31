class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }
        
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int carry = 0;
        int sum = 0;
        ListNode res = new ListNode(0);
        ListNode curr = res;
        
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (!s1.isEmpty()) {
                sum += s1.pop();
            }
            if (!s2.isEmpty()) {
                sum += s2.pop();
            }
            sum += carry;
            carry = sum / 10;
            res.val = sum % 10;
            curr = new ListNode(carry);
            curr.next = res;
            res = curr;
            sum = 0;
            
        }
        return res.val == 0 ? res.next : res;
        
    }
}