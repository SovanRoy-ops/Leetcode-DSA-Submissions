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
