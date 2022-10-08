class Solution {
  
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==0) return new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int key : nums){
            hm.put(key, hm.getOrDefault(key,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hm.get(a) -hm.get(b));
        for(int n : hm.keySet()){
            pq.add(n);
            if(pq.size()>k) pq.poll();
        }
            int[] ans = new int[k];
            int i=0;
            while(!pq.isEmpty()){
                int num = pq.poll();
                ans[i++] = num;
            }
             return ans;
    }
}
