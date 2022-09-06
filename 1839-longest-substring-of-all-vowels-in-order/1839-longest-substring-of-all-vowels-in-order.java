class Solution {
    
   public int longestBeautifulSubstring(String word) {
		int ans = 0;
		int bar = 0;
		int n = word.length();
		String str = "aeiou";
		int v = str.length();

		if (n < v) return 0;

		while (bar < n) {
			int end = bar;
			int k = 0;

			while (end < n && k < v && word.charAt(end) == str.charAt(k)) {
				
				while (end < n && word.charAt(end) == str.charAt(k)) {
					end++;
				}
                
				k++;
			}

			if (k == v) ans = Math.max(ans, end - bar);
			bar = end;

			while (bar < n && word.charAt(bar) != 'a') bar++;
		}
	        return ans;
	}
}