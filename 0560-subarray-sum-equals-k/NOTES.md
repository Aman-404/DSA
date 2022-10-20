private static int[] find(int[] a, int target) {
if (a.length < 2 || target < 0) {
return new int[]{-1,-1};
}
int start = 0, end = 1, n = a.length;
int runningSum = a[start] + a[end];
while (end < n) {
if (runningSum == target) {
return new int[]{start,end};
} else if (runningSum > target) {
runningSum -= a[start];
start++;
} else if (runningSum < target) {
end++;
if (end < n) {
runningSum += a[end];
}
}
}
return new int[]{-1,-1};
}