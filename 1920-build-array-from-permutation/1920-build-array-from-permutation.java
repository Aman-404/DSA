class Solution {
    public int[] buildArray(int[] nums) {
        int n =nums.length;
        int[] ans = new int[n];
        int k=0;
        for(int num=0;num<n;num++){
            ans[k++]= nums[nums[num]];
        }
        return ans;
    }
}