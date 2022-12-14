
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null) return null;
    if (head.next == null) return null;
 
    ListNode slowPtr = head;
    ListNode fastPtr = head;
 
    ListNode prevSlowPtr = head;
    while (fastPtr != null && fastPtr.next != null) {
        fastPtr = fastPtr.next.next;
        prevSlowPtr = slowPtr;
        slowPtr = slowPtr.next;
    }
 
    prevSlowPtr.next = slowPtr.next;
    return head;  
    }
}