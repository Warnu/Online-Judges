// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: Running Sum of 1d Array
// Problem Link: https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        int result[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(i==0)
                result[i] = nums[i];
            else
                result[i] = nums[i] +result[i-1];
        }      
        
        return result;
    }
}