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
        if(head==null) return head;
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            if(temp==head && temp.val==val){
                head=head.next;
                prev=temp;
                temp=head;
            }
            else if(temp.val==val){
                prev.next=temp.next;
                temp=temp.next;
            }else{
                prev=temp;
                temp=temp.next;
            }
        }
        return head;
    }
}