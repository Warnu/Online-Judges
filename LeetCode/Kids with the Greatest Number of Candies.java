// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: Kids with the Greatest Number of Candies
// Problem Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();
        int highest=candies[0];
        
        for(int i=0;i<candies.length;i++){
            if(candies[i]>= highest)
                highest=candies[i];
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=highest)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}