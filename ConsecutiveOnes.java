//TC-O(n)
//https://leetcode.com/problems/max-consecutive-ones/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(currentCount, maxCount);
                currentCount = 0;
            }
        }
        return Math.max(currentCount, maxCount);
    }
}
