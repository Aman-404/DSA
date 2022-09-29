class Solution {
    public int mostWordsFound(String[] s) {
        int max = Integer.MIN_VALUE;
       
        for(int i=0;i<s.length;i++){
            
              max = Math.max(max,(s[i].split(" ")).length);
            }
            return max;
        }
}