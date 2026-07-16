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
        HashSet<ListNode> nodes = new HashSet<>();
        ListNode temp = head;
        while(temp !=null){
            if(nodes.contains(temp) == true){
                return true;
            }
            nodes.add(temp);
            temp = temp.next;
        }
        return false;
    }
}