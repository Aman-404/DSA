class Solution {
   public boolean canBeIncreasing(int[] nums) {
       int n=nums.length-1;
       int count=0;
       for(int i=0;i<n;i++){
           if(nums[i]>=nums[i+1]){
               if(++count>1){ 
                   return false;
               }
           }
           if(i!=0 && nums[i-1]>=nums[i+1]){
               nums[i+1]=nums[i];
           }
       }
	
	return true;
}
}