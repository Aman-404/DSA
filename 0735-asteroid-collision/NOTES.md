```
Stack<Integer> st = new Stack<>();
for(int i = 0 ; i < asteroids.length ; i++){
if(asteroids[i] > 0){
st.push(asteroids[i]);
}
else{
while(!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(asteroids[i])){
st.pop();
}
if(st.isEmpty() || st.peek() < 0)
st.push(asteroids[i]);
else if(st.peek() == Math.abs(asteroids[i]))
st.pop();
}
}
int[] arr = new int[st.size()];
int h = arr.length - 1;
while (!st.isEmpty()) {
arr[h] = st.pop();
h--;
}
return arr;