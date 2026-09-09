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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddIndex=new ListNode(0);
        ListNode evenIndex=new ListNode(0);
        ListNode odd=oddIndex;
        ListNode even=evenIndex;
        int i=0;
        while(head!=null){
            if(i%2==0){
                evenIndex.next=head;
                evenIndex=evenIndex.next;
            }else{
                oddIndex.next=head;
                oddIndex=oddIndex.next;
            }
            i++;
            head=head.next;
        }
        evenIndex.next=odd.next;
        oddIndex.next=null;
        return even.next;
    }
}