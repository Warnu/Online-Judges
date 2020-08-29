// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: Shuffle String
// Problem Link: https://leetcode.com/problems/shuffle-string/

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] result = new char[s.length()];
        for(int i=0; i<indices.length;i++)
            result[indices[i]] = s.charAt(i);
        
        return String.valueOf(result);
    }
}