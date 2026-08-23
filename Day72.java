//leetcode 206
class Solution {
    public ListNode solve(ListNode prev,ListNode curr){
        if(curr==null){
            return prev;
        }
        ListNode forward=curr.next;
        curr.next=prev;
        prev=curr;
        curr=forward;
        return solve(prev,curr);
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode ans=solve(prev,curr);
        return ans;
    }
}
