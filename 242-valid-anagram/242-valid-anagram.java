class Solution {
    public boolean isAnagram(String str1, String str2) {
         int n1=str1.length();
	     int n2=str2.length();

	        int[] fre1=new int[26]; 
	        for(int i=0; i<n1; i++){
	            char ch=str1.charAt(i);

	            int idx=ch-'a';
	            fre1[idx]++;
	        }

	        int[] fre2=new int[26]; 
	        for(int i=0; i<n2; i++){
	            char ch=str2.charAt(i);

	            int idx=ch-'a';
	            fre2[idx]++;
	        }
         for(int i=0; i<26; i++){
	            if(fre1[i]!=fre2[i]){ // frequency of ith character is not equal
	                return false;
	            }
	        }
        return true;
    }
}