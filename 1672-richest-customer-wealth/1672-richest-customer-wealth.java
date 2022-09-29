class Solution {
    public int maximumWealth(int[][] ac) {
        int max = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<ac.length;i++){
            for(int j=0;j<ac[0].length;j++){
                sum+=ac[i][j];
            }
            max = Math.max(sum,max);
            sum=0;
        }
        return max;
    }
}