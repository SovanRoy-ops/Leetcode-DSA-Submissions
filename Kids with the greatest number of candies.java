//1st approach(BEST) TC - O(n), SC - O(n)
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int max=-1;
        for(int candy : candies){
            if(candy>max)
                max=candy;
        }
        for(int candy : candies){
            result.add(candy+extraCandies >= max);
        }
        return result;
    }
}

//2nd Approach TC - O(n^2), SC - O(n)
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            int newCandies = candies[i]+extraCandies;
            res.add(true);
            for(int j=0;j<candies.length;j++){
                if(newCandies<candies[j]){
                    res.set(i,false);
                    break;
                }
            }
        }
        return res;
    }
}
