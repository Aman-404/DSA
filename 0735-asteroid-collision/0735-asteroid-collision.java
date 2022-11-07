class Solution {
    public int[] asteroidCollision(int[] a) {
        int[] ret = new int[a.length];
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0 || index==-1 || ret[index] < 0){
                ret[++index] = a[i];
            } else if (ret[index] <= -a[i]){
                if (ret[index--] < -a[i]) {i--;}
            }
        }
        return Arrays.copyOfRange(ret, 0, Math.max(index+1,0));
    }
}