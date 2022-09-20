class Solution {
    public int trap(int[] arr) {
        int n= arr.length;
        int i=0,j=n-1;
        int lmax=0,rmax=0;
        int res = 0;
        
        while(i<=j){
            //find smaller height
            if(arr[i]<=arr[j]){
                if(arr[i]<lmax){
                    res = res+(lmax - arr[i]);
                }
                else{
                    lmax = arr[i];
                }
                i++;
            }
            else{
                if(arr[j]<rmax){
                    res = res+(rmax - arr[j]);
                }
                else{
                    rmax = arr[j];
                }
                j--;
            }
        }
        return res;
        
    }
}