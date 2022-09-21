class Solution {
        public List<Integer> intersection(int[][] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for (int[] arr : nums) {
            for (int i : arr) {
                map.put(i,map.getOrDefault(i,0) + 1);
            }
        }
        
        for (Integer i : map.keySet()) {
            if (map.get(i) == nums.length) list.add(i);
        }
        
        Collections.sort(list);
        
        return list;        
    }

}