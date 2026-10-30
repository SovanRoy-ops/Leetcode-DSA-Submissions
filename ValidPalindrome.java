//TC-O(n) SC-O(1)
//https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char l = s.charAt(left);
            char r = s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(r)){
                right--;
                continue;
            }
            if(Character.toLowerCase(l)!=Character.toLowerCase(r)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
