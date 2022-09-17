class Solution {
    public int nextGreaterElement(int n) {
        
       char arr[] = (Integer.toString(n)).toCharArray();
        
        int i= arr.length-2;
        //find first smallest number Right to left
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i==-1) return -1;
        
        
        //find just greater number that ith index element
        int k = arr.length-1;
        while(arr[i]>=arr[k]){
            k--;
        }
        //Swap from i and k
        char temp = arr[i];
        arr[i] = arr[k];
        arr[k]= temp;
        
        
        // cancatenate from 0 to i
        String res = "";
        for(int j=0; j<=i;j++){
            res+=arr[j];
        }
         // cancatenate from k to i+1 index(reverse order)
        for(int j=arr.length-1; j>i;j--){
            res+=arr[j];
        }
        
        long val = Long.parseLong(String.valueOf(res));
		return val > Integer.MAX_VALUE ? -1 : (int) val;
       
    }
}