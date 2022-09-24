class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        int ans = 0;
        int sum=0;
        hm.put(0,-1);
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                sum+=-1;
            }
            else if(nums[i]==1){
                sum+=1;
                
            }
            
            if(hm.containsKey(sum)){
                int idx = hm.get(sum);
                int len = i-idx;
                if(len>ans){
                    ans=len;
                }
            }else{
                  hm.put(sum,i);
            }
        }
        return ans;
    }
}