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
    public ListNode rotateRight(ListNode head, int k) 
    {
        int c=1;
        if(head==null)
        return null;
        ListNode temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            c++;
        }
        temp.next=head;
        k=k%c;
        ListNode tail=head;
        for(int i=1;i<c-k;i++)
        {
            tail=tail.next;
        }
        ListNode h2=tail.next;
        tail.next=null;
        return h2;
    }
}