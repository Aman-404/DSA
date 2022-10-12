
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        
        ListNode even = head.next;
        ListNode e = head.next; 
         ListNode o = head;
        
        while(e!=null && e.next!=null){
           o.next = o.next.next;
           e.next = e.next.next;
           o=o.next;
           e = e.next;
            
        }
        o.next = even;
       
        return head;
    }
}