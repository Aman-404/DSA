class Solution {
   public int[] runningSum(int[] arr) {
        int i = 1;
        while (i<arr.length){
           arr[i]+=arr[i-1];
            i++;
        }
        return arr;
    }
}