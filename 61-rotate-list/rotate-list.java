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
    public ListNode rotateRight(ListNode head, int k) {

    if (head == null) {
    return head;
    }
       int length = 1;
        ListNode temp = head;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }
        
        k = k % length; 
        
        for (int i = 0; i < k; i++) {
            ListNode current = head;
            while (current.next.next != null) {
                current = current.next;
            }
           
            ListNode last = current.next;
            current.next = null; 
            last.next = head;   
            head = last;        
        }
        
        return head; 
    }
}