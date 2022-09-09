class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int k = 0;
        int[] res = new int[n*(n+1)/2];
        
        for(int i = 0; i < n; i++) {
            
            int sum = 0;
            
            for(int j = i; j < n; j++) {
                
                sum += nums[j];
                
                res[k++] = sum;
            }
        }
       
        int ans = 0, mod = 1000000007;
        Arrays.sort(res);
        for(int i = left-1; i < right; i++) {
            ans = (ans+res[i])%mod;
        }
        
        return ans;
        
    }
}