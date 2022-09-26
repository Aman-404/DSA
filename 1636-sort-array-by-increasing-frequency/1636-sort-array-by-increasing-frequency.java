class PairComparator implements Comparator<Pair>{
    public int compare(Pair p1, Pair p2) {
        if (p1.getKey() > p2.getKey())
            return 1;
        else if (p1.getKey() < p2.getKey())
            return -1;
        
        if (p1.getValue() < p2.getValue())
            return 1;
        else if (p1.getValue() > p2.getValue())
            return -1;
        return 0;
    }
}
public class Pair {
    private Integer key;
    private Integer value;
    Pair(int key, int value){
        this.key = key;
        this.value = value;
    }
    
    int getKey(){
        return this.key;
    }
    int getValue(){
        return this.value;
    }
}
class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        
        PriorityQueue<Pair> queue = new PriorityQueue<>(new PairComparator());
        map.forEach((k, v) -> {
            queue.add(new Pair(v, k));
        });
        
        int[] res = new int[nums.length];
        int c = 0;
        while(!queue.isEmpty()){
            Pair pair = queue.poll();
            for(int i=0; i<pair.getKey(); i++){
                res[c++] = pair.getValue();
            } 
        }
        return res;
    }
}