class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] op = new int[n];
        int even_sum = 0;
        for(int i : nums){
            if( i%2==0){
                even_sum += i;
            }
        }
        for(int i=0;i<n;i++){
            int inx = queries[i][1];
            int val = queries[i][0];
            
            if(nums[inx]%2==0){
                even_sum -= nums[inx];
            }
            nums[inx]+= val;
            
             if(nums[inx]%2==0){
                even_sum+=nums[inx];
            }
            op[i] = even_sum;
        }
        return op;
    }
}