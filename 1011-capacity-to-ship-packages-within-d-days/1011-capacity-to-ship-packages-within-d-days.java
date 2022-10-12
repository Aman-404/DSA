class Solution {
    public int shipWithinDays(int[] weights, int D) {
       int left=0,right=0;
        for(int w: weights){
            left = Math.max(left,w);
            right+=w;
            
        }
        while(left<right){
            int mid = (left+right)/2;
            int day=1,cur=0;
            for(int w: weights){
                if(cur+w>mid){
                    day+=1;
                    cur=0;
                }
                    cur+=w;
            }
            if(day>D) left = mid+1;
            else right=mid;
        }
        return left;
    }
}