class Solution {
    
     class Pair implements Comparable<Pair>{
        String name;
        int height;
        Pair(String name, int height){
            this.name = name;
            this.height = height;
        }
        public int compareTo(Pair o){
            return o.height - this.height;
        }
    }
    public String[] sortPeople(String[] names, int[] heights) {
        String[] ans = new String[names.length];
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0; i<names.length; i++){
            pq.add(new Pair(names[i], heights[i]));
            
        }
        
        int i = 0;
        while(!pq.isEmpty()){
            ans[i++] = pq.remove().name;
        }
        return ans;
    }
}