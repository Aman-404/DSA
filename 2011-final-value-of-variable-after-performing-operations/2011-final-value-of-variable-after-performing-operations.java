class Solution {
    public int finalValueAfterOperations(String[] op) {
        int sum = 0;
        for(int i=0;i<op.length;i++){
            if(op[i].charAt(1)=='+') sum++;
            else sum--;
        }
        return sum;
    }
}