
class Solution {
    
    public static int sizeOf(ListNode head){ 
        ListNode current = head;
        int len =0;
        while(current != null){
            len++;
            current = current.next;
        }
        return len;
    }
      
   public static ListNode[] splitListToParts(ListNode head, int k) {
	
        int len = sizeOf(head); 
		
        int size = len/k; 
		
        int rem = len%k; 
		
        ListNode current = head;
        ListNode prev = head;
        int i=0;
        
        ListNode [] ans = new ListNode[k]; 
        
        while(current != null && i<k){
            ans[i]=current;
            for(int j=0; j<size+(rem>0?1:0);j++){
                prev = current;
                current = current.next;
            }
            prev.next = null;
            i++;
            rem--;
        }
        return ans;
    }
    
    
}