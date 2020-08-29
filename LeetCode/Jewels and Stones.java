// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: Jewels and Stones
// Problem Link: https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        for(int i=0;i<S.length();i++)
            for(int e=0;e<J.length();e++)
                if(S.charAt(i)==J.charAt(e))
                    count++;
        return count;
    }
}