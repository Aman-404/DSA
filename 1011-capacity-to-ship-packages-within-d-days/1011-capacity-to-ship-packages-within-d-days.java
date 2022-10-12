class Solution {
     public int shipWithinDays(int[] weights, int D) {
        int left = 0;
        int right = 0;
        
        for (int weight: weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        
        while (left < right) {
            int mid = (left + right) / 2;
            int curr = 0;
            int days = 1;
            
            for (int weight: weights) {
                if (curr + weight > mid) {
                    curr = 0;
                    days++;
                }
                
                curr += weight;
            }
            
            if (days > D) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        return left;
    }
}