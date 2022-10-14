class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        if(k>n || k==n){
            return "0";
        }
        Stack<Character> st = new Stack<>();
        
        for(int i=0;i<n;i++){
            char ch = num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()>ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        
        //for conition 1111 9999 123456
        
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
         while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse(); //  we got from stack that is in reverse order so reverse again 
        
        while(sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0); //while there is 0 int starting of string remove it
        
        return sb.toString();
    }
}