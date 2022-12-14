class Solution {
    public int[] findErrorNums(int[] nums) {
     
        int dup = 0,sum=0,n=nums.length;
        boolean[] visted = new boolean[10001];
        for(int i : nums){
            if(visted[i]){
                dup=i;
            }
            visted[i]=true;
            sum+=i;
        }
       	int nsum =  (n * (n+1)) / 2;
        
        return new int[] {dup, dup + nsum - sum}; 
    }
}