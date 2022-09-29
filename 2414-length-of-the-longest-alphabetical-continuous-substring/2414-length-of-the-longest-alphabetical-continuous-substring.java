class Solution {
    public int longestContinuousSubstring(String s) {
        int max=1;
        int count=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            char ch1=s.charAt(i-1);
            if(ch1+1==ch){
                count++;
                max=Math.max(count,max);
                
            }else{
                max=Math.max(count,max);
                count=1;
            }
        }
        return max;
    }
}