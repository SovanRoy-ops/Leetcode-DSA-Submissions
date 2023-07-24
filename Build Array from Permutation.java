class Solution {
    public int[] buildArray(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]+=+n*(nums[nums[i]]%n);
        }
        for(int i=0;i<n;i++){
            nums[i]/=n;
        }
        return nums;
    }
}

// 2nd approach
class Solution {
    public int[] buildArray(int[] nums) {
        int CONST = 1001; // Taking a value higher than the limit used by array length
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            int b = nums[a]%CONST;
            nums[i] = a + b*CONST;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]/CONST;
        }
        return nums;
    }
}
