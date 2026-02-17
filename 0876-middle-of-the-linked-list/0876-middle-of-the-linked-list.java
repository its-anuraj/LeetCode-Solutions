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
    public ListNode middleNode(ListNode head) {
        int count = 0;

        ListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;

        }

        int midnode = count / 2;
        curr = head;
        while (midnode > 0) {
            curr = curr.next;
            midnode--;

        }
        return curr;
    }
}