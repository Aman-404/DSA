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
    private int size(ListNode head){
        int len=0;
        while(head!=null){
            head = head.next;
            len++;
        }
      
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
       
          if(head == null)   return head;
        
         int n=size(head);
        
         k=k%n;
        // System.out.print(k);
        if(k==0) return head;
        int len =n-k;
        int idx=1;
        ListNode temp =head;
        
        while(idx<len){
            temp = temp.next;
            idx++;
        }
        ListNode newHead = temp.next;
        temp.next=null;
        ListNode temp2 = newHead;
        while(temp2.next!=null){
            temp2=temp2.next;
        }
        temp2.next=head;
        return newHead;
    }
     
}