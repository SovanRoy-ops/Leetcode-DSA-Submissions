//Brute force TC- O(n), SC - O(1)
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i =0; i<letters.length; i++)
            if(letters[i]>target)
                return letters[i];
        return letters[0];
    }
}

// Optimised approach(Binary search) TC - O(log(n)), SC - O(1)
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1;
        while(start<=end){
           int mid=start+(end-start)/2;
             if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
