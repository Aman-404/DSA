class Solution {
    public boolean isSubsequence(String str, String tar) {
         int a=0,b=0;
        while(b<tar.length() && a<str.length()){
            if(str.charAt(a) == tar.charAt(b)){
                a++;
            }
            b++;
        }
        return (a==str.length());
    }
}