class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int maxlen = 0;
        st.push(-1);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                st.push(i);
            }else{
                if(ch==')'){
                    st.pop();
                    if(st.size()==0){
                        st.push(i);
                    }else{
                        int len = i-st.peek();
                        maxlen = Math.max(len,maxlen);
                    }
                }
            }
        }
        return maxlen;
    }
}