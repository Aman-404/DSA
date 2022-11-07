class Solution {
public int maximum69Number (int num) {
int tmp = num;
int max = num;
int pop = 0;
int index = 0;
while (tmp > 0) {
pop = tmp % 10;
tmp /= 10;
if (pop == 6) {
int updated = num + 3 * (int) (Math.pow(10, index));
if (updated > max) {
max = updated;
}
}
index++;
}
return max;
}
}