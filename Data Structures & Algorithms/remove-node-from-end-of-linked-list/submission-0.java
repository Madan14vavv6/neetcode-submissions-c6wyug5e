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
