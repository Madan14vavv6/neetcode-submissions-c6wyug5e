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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int k = 0;
        ListNode t1 = head;
        int len = 0;
        while(t1 != null){
            len++;
            t1 = t1.next;
        }
        n = n % len;
        while(temp != null){
            if(head.next == null){
                return null;
            }
            if(n == k){
                ListNode t = temp.next;
                temp.val = t.val;
                temp.next = t.next;
                //temp = temp.next;
                k++;
            }
            temp = temp.next;
            k++;
        }
        return head;
    }
}
