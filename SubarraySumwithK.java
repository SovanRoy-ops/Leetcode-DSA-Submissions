class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;
        for (int j = k; j < nums.length; j++) {
            windowSum += nums[j];
            windowSum -= nums[j - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
