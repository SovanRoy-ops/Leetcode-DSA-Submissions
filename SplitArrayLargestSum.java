// https://leetcode.com/problems/split-array-largest-sum/
class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0,end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]); //in the end of this loop this will contain max elemenet of the array
            end=end+nums[i];
        }

        while(start<end){
            int mid=start+(end-start)/2;
            //calculate how many pieces you can divide this in with this max sum
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if(sum+num > mid){
                    //you cannot add in this subarray,make a new one
                    // say you add this number in new array, then sum=num
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>k){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start; //here end==start
    }
}
