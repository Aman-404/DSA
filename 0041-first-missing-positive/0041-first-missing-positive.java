class Solution {
    public int firstMissingPositive(int[] arr) {
        //Mark element which outof rang and manage presence of 1
        
        boolean one  = false;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                one = true;
            }
            if(arr[i]<1 || n<arr[i]){
                arr[i] = 1;
            }
           
        }
         if(one==false) return 1;
        //Map element with index
        
        for(int i=0;i<n;i++){
            int idx = Math.abs(arr[i]);
            arr[idx-1] = -Math.abs(arr[idx-1]);
        }
        //find missing number
        for(int i=0;i<n;i++){
           if(arr[i]>0) return i+1;
        }
        return n+1;
    }
}