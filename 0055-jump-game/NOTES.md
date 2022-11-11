public boolean canJump(int[] nums) {
int last = nums.length - 1; // last index/ position to reach
for (int i = nums.length - 2; i >= 0; i--) {
if (i+nums[i] >= last) { // check if i+nums[i] >= last means we can reach to that index
//with curr value and from current index and if yes then
//change last to current index
last = i;
}
}
return last <= 0; // if last <= 0  then that means we can reach to solution if we start from begining also return true else false
}