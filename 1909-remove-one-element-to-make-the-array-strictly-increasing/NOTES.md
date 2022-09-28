```
for (int i = 0, faults = 0; i + 1 < nums.length; i++)
if (nums[i] >= nums[i + 1]) {
if (++faults == 2)
return false;
if (i != 0 && nums[i - 1] >= nums[i + 1])
nums[i + 1] = nums[i];
}``
```