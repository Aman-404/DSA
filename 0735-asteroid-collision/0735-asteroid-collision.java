class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < asteroids.length ; i++){
         //positive add
            if(asteroids[i] > 0) st.push(asteroids[i]);
               
            else{
                 //elemination
                while(!st.isEmpty() && st.peek() > 0  && st.peek() < Math.abs(asteroids[i])) st.pop();
                   //nagative element 
                if(st.isEmpty() || st.peek() < 0)  st.push(asteroids[i]);
                   //Equal element when taking abs
                else if(st.peek() == Math.abs(asteroids[i])) st.pop();
                    
            }
        }
        int[] ans = new int[st.size()];
        int i = ans.length - 1;
        while (!st.isEmpty()) {
            ans[i] = st.pop();
           i--;
        }
        return ans;
    }
}