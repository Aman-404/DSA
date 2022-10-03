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
    public int getDecimalValue(ListNode head) {
       
        int res = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int p = 0;
        for(int i=list.size()-1;i>=0;i--){
            int pow = (1<<p);    //  Finding 2 to the power p
            res += (pow*list.get(i));
            p++;
        }
        
        return res;
    }
}