class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length,ans=nums[0];
        int pmax=nums[0],pmin=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=pmax;
                pmax=pmin;
                pmin=temp;
            }
            pmax=Math.max(nums[i],nums[i]*pmax);
            pmin=Math.min(nums[i],nums[i]*pmin);
            ans=Math.max(ans,pmax);
        }
        return ans;
        
    }
}