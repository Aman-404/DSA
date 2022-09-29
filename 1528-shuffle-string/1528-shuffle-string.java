class Solution {
    public String restoreString(String s, int[] in) {
        char[] ch = new char[s.length()];
        for(int i=0;i<in.length;i++){
            char chr = s.charAt(i);
            int n= in[i];
            
            ch[n]=chr;
        }
        String str = new String(ch);
        return str;
    }
}