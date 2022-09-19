class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
		int[] res = new int[n];
		int i=0,j=n-1;
		int indx = n-1;
		while(i<=j) {
			int v1  = nums[i]*nums[i];
			int v2 = nums[j]*nums[j];
			if(v1>v2) {
				res[indx] = v1;
				i++;
			}else {
				res[indx] =v2;
				j--;
			}
			indx--;
		}
		return res;
}
}