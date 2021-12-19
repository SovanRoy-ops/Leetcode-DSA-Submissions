class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String operation : operations){
            x += operation.charAt(1) == '+' ? 1 : -1;
        }
       return x; 
    }
}
