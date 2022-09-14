class Solution {
    public boolean checkValid(int[][] arr) {
        int n=arr.length;
        for(int r=0;r<n;r++){
            boolean rv[] = new boolean[n+1];
            boolean cv[] = new boolean[n+1];
            
            for(int c=0;c<n;c++){
                int rval = arr[r][c];
                int cval = arr[c][r];
                if(rv[rval]==true || cv[cval]==true){
                    return false;
                }
                rv[rval]=true;
                cv[cval]=true;
            }
        }
         return true;
    }
              
}