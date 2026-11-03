//TC - O(n), SC - O(1)
// https://leetcode.com/problems/maximum-average-subarray-i/
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        maxSum = windowSum;

        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return (double) maxSum / k;
    }
}
