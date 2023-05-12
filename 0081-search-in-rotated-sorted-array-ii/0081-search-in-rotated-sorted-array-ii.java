class Solution {
    public boolean search(int[] nums, int target) {
        
        for(int n:nums){
            if(target==n) return true;
        }
        return false;
    }
}