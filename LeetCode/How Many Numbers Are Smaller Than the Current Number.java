// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: How Many Numbers Are Smaller Than the Current Number
// Problem Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int e=0;e<nums.length;e++)
                if(nums[e]<nums[i])
                    count++;
            
            result[i]=count;
        }
        return result;
    }
}