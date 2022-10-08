class Solution {
    class Pair implements Comparable<Pair>{
        int key;
        int value;
        Pair(int key,int value){
            this.key=key;
            this.value = value;
        }
        public int compareTo(Pair other){
            return this.value -other.value;
        }               
    }
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==0)  return new int[k];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue();
        for(int key : hm.keySet()){
            pq.add(new Pair(key,hm.get(key)));
        }
           
        while(pq.size()>k){
            pq.remove();
        }
       int[] ans = new int[k];
        int i=0;
        while(!pq.isEmpty()){
            Pair rm = pq.remove();
            ans[i++] = rm.key;
        }
        return ans;
    }
}