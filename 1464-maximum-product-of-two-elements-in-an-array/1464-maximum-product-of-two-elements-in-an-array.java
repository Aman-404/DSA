class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
     int k =  (  nums[n-1]-1)*(  nums[n-2]-1);
        return k;
    }
}