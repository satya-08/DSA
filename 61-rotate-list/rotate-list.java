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
        if(k==0) return head;
        if(head==null) return null;
        int len=0;
        ListNode temp=head;
        ListNode tail=head;
        while(temp!=null){
            temp=temp.next;
            if(tail.next!=null)
            tail=tail.next;
            len++;
        } 
        k%=len;
        if(k==0) return head;
        temp=head;
        ListNode prev=null;
        for(int i=0;i<len-k;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        tail.next=head;
        head=temp;
        return head;

    }
}