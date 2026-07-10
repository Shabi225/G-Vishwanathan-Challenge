/*Leetcode 203: Remove Linked List Elements*/
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans=new ListNode(0,head);
        ListNode curr=ans;
        while(curr != null){
            while (curr.next != null && curr.next.val == val) {
                curr.next=curr.next.next;
            }
            curr=curr.next;
        }
        return ans.next;
    }
}
