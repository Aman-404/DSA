class Solution {
   public int longestPalindrome(String s) {
        int[] charCount = new int[128];

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        int len = 0;

        for (int count : charCount) {
            len += 2 * (count / 2);
        }

        return len < s.length() ? len + 1 : len;
    }
}