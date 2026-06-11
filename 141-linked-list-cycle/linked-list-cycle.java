/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        int marker = 999999; 
        
        while (current != null) {
            if (current.val == marker) {
                return true;
            }
            current.val = marker;
            current = current.next;
        }
        
        return false;
    }
}