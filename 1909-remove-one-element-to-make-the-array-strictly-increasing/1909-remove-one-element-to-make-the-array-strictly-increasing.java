class Solution {
   public boolean canBeIncreasing(int[] nums) {
       int n=nums.length-1;
       int count=0;
       for(int i=0;i<n;i++){
           if(nums[i]>=nums[i+1]){
                count++;
               if(count>1){
                  
                   return false;
               }
           }
           if(i!=0 && nums[i-1]>=nums[i+1]){
               nums[i+1]=nums[i];
           }
       }
	// for (int i = 0, faults = 0; i + 1 < nums.length; i++)
	// 	if (nums[i] >= nums[i + 1]) {
	// 		if (++faults == 2)
	// 			return false;
	// 		if (i != 0 && nums[i - 1] >= nums[i + 1])
	// 			nums[i + 1] = nums[i];
	// 	}
	return true;
}
}