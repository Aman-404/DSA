class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
            
            boolean canPush = true;
            while(!stack.isEmpty() && (stack.peek()*asteroid)<0){
            
                if(stack.peek() < 0 && asteroid > 0) break;
                int absAsteroid = Math.abs(asteroid);
                int absTop = Math.abs(stack.peek());

                if(absAsteroid > absTop)
                    stack.pop();
            
                else if(absAsteroid == absTop){
                    stack.pop();
                    canPush = false;
                    break;
                }
      
                else {
                    canPush = false;
                    break;
                }
            }

            if(canPush) stack.push(asteroid);
        }

        int size = stack.size();
        int[] result = new int[size];
        for(int i=size-1; i>=0; i--)
            result[i] = stack.pop();

        return result;
    }
}