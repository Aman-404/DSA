class Solution {
    public int findDuplicate(int[] nums) {
        int n= nums.length;
        for(int val: nums){
            int idx = Math.abs(val);
            
            if(nums[idx]<0){
                return idx;
            }
            nums[idx] = -nums[idx];
        }
        return n;
    }
}