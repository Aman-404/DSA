class Solution {
    
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n * 2; i++){
            int num = nums[i % n];
            while(!stack.isEmpty() && num > nums[stack.peek()]){
                result[stack.pop()] = num;
            }
            if(i < n){
                stack.push(i);
            }
        }
        return result;
    }

}