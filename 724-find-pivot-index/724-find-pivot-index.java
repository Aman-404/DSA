class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;

        int[] pre=new int[n];

        int sum=0;
        for(int i=0; i<n; i++){
            sum=sum+nums[i];

            pre[i]=sum;
            
        }
  
        for(int i=0; i<n; i++){
            int left_sum;
            if(i==0){
                left_sum=0;
            } else {
                left_sum=pre[i-1];
            }
            
            int right_sum=pre[n-1]-pre[i];

            if(left_sum==right_sum){
                return i;
            }
        }

        return -1;
    }
}