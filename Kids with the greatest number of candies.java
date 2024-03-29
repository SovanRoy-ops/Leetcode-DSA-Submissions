//1st approach(BEST) TC - O(n), SC - O(n)
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int gauge = Integer.MIN_VALUE;
        for(int candy : candies){
            gauge=Math.max(gauge,candy);
        }
        gauge-=extraCandies;
        for(int candy : candies){
            result.add(candy>= gauge);
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
