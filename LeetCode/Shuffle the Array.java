// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: Shuffle the Array
// Problem Link: https://leetcode.com/problems/shuffle-the-array/

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[n*2];
        
        for(int i=0; i<n;i++){
            
            result[i*2]=nums[i];
            
            result[(2*i)+1]=nums[n+i];
        }
        
        return result;
    }
}