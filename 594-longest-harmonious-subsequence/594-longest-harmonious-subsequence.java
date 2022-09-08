class Solution {
    public int findLHS(int[] nums) {
        int res =0;
        
        Map<Integer, Integer> count= new HashMap<>();
        
		for(int i : nums){
			count.put(i, count.getOrDefault(i,0)+1);
		}
        
        for(int i : count.keySet()){
			if(count.containsKey(i+1)){
				res = Math.max(res, count.get(i)+count.get(i+1));
			}
		}
		return res;
    }
}