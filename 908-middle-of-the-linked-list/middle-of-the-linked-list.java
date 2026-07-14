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
        int size = sizeOfLL(head);
        int count = 0;
        int mid = size / 2;
        ListNode temp = head;
        while(temp != null){
            if(count == mid){
                return temp;
            }
            count++;
            temp = temp.next;
        }
        return null;
        
    }

    public static int sizeOfLL(ListNode head){
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}