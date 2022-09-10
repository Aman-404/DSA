class Solution {
    public int[] maxSlidingWindow(int[] num, int k) {
        	int n = num.length;
		int[] ans = new int[n-k+1];
		//for indices of next greater element
		int[] ngr = new int[n];
		Stack<Integer> st = new Stack<>();
		for(int i=n-1;i>=0;i--) {
			int ele = num[i];
			while(st.size()>0 && num[st.peek()]<=ele) {
				st.pop();
			}
			if(st.size()==0) {
				ngr[i]=n;
			}else {
				ngr[i]=st.peek();
			}
			st.push(i);
		}
		
		int idx=0;
		for(int sp=0;sp<=(n-k);sp++) {
			if(idx<sp) {
				idx = sp;
			}
			int ep = sp+k-1;
			while(ngr[idx]<=ep) {
				idx = ngr[idx];
			}
			ans[sp] = num[idx];
		}
		return ans;
    }
}