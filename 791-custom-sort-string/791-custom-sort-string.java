class Solution {
    public String customSortString(String order, String s) {
        String s1="";
        String s2="";
        int[] a = new int[26];
        for(char ch : order.toCharArray()) a[ch-'a']++;
        for(char c : s.toCharArray()){
            if(a[c-'a']==0) s2+=c;
            else{
                a[c-'a']++;
            }
        }
        for(char ch : order.toCharArray()){
            while(a[ch-'a']>1){
                s1+=ch;
                a[ch -'a']--;
            }
        }
        return s1+s2;
    }
}