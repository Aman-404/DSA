class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i < k; i++){
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        res[0] = nums[deque.peekFirst()];
        for(int i = k; i < nums.length; i++){
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            if(!deque.isEmpty() && deque.peekFirst() <= i - k){
                deque.pollFirst();
            }
            deque.offerLast(i);
            res[i - k + 1] = nums[deque.peekFirst()];
        }
        return res;
    }
}