//1st approach
class Solution {
    public int findNumbers(int[] nums) {
        int total=0;
        for(int n : nums){
            int count=0;
            while(n>0){
                n=n/10;
                count++;
            }
            if(count%2==0)
                total++;
        }
        return total;
    }
}

//2nd approach
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n : nums){
           if(String.valueOf(n).length()%2 == 0)
            count++;
        }
        return count;
    }
}

//3rd approach
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>9 && nums[i]<100 || nums[i]>999 && nums[i]<10000 || nums[i]==100000)
           count++;
        }
        return count;
    }
}

//4th approach
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n : nums){
            if((int)(Math.log10(n) + 1)%2 == 0)   // TRICK FOR FINDING NUMBER OF DIGITS IN A NUMBER
                count++;
        }
        return count;
    }
}
