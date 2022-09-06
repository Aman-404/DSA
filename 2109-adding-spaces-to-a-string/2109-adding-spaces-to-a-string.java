class Solution {
     public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder();
        int l = 0;
        for (int spaceIdx : spaces) {
            sb.append(s.substring(l, spaceIdx));
            sb.append(' ');
            l = spaceIdx;
        }
        //last piece - from last space position to the end of string
        sb.append(s.substring(l, s.length()));
        return sb.toString();
    }
}