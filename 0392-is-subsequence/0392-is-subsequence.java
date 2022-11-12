class Solution {
    public boolean isSubsequence(String str, String tar) {
        
        if(str.length() == 0)
            return true;
         int a=0,b=0;
        while(b<tar.length() && a<str.length()){
            if(str.charAt(a) == tar.charAt(b)){
                a++;
            }
            b++;
             if(a == str.length()) return true;
        }
        return false;
    }
}