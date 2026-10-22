//TC - O(n)
//https://leetcode.com/problems/max-consecutive-ones-iii/
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            if (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
        }
        return n - left;
    }
}
