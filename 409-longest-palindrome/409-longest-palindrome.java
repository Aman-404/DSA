class Solution {
    public int longestPalindrome(String str) {
        int res = 0;
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			hm.put(ch,hm.getOrDefault(ch, 0)+1);
		}
		boolean fodd = false;
		int ans = 0;
		for(Character key : hm.keySet()) {
			if(hm.get(key)%2==0) {
				ans+=hm.get(key);
			}else if(fodd==false) {
				ans+=hm.get(key);
				fodd=true;
			}else {
				ans+=hm.get(key)-1;
			}
		}
		return ans;
    }
}