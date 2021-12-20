class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[2*n];
        for(int i=0;i<n;i++){
           arr[2*i]=nums[i];
           arr[2*i+1]=nums[i+n];
        }
        return arr;
    }
}


// Alternate approach

public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        for (int i = 0; i < 2 * n; ++i) {
            ans[i] = nums[i / 2 + i % 2 * n];
        }
        return ans;
}


// Alternate approach using bit manipulation
class Solution {
    public int[] shuffle(int[] nums, int n) {
          
        final int len = nums.length;
        
        for(int i = n; i < len; i++){
            nums[i] = (nums[i] << 10) | nums[i - n];
        }
        
        int index = 0;
        for(int i = n; i < len; i++, index += 2){
            nums[index] = nums[i] & 1023;
            nums[index + 1] = nums[i] >>> 10;
        }
        
        return nums;
    }
}
