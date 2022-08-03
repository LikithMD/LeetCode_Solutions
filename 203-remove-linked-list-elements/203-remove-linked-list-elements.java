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
    public ListNode removeElements(ListNode head, int val) {
        ListNode help=new ListNode();
        help.next=head;
        ListNode p=help;
        while(p.next!=null) {
            if(p.next.val==val) {
                ListNode next=p.next;
                p.next=next.next;
            }
            else
                p=p.next;
        }
        return help.next;
    }
}