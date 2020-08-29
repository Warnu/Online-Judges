// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: Decompress Run-Length Encoded List
// Problem Link: https://leetcode.com/problems/decompress-run-length-encoded-list/

class Solution {
    public int[] decompressRLElist(int[] nums) {
        int maxResult = 0;
        for(int i=0;i<nums.length;i+=2) maxResult += nums[i];
        int[] result = new int[maxResult];
        int counter =0;
        for(int i=0;i<nums.length;i+=2){
            for(int e=0;e<nums[i];e++){
                result[counter] = nums[(i+1)];
                counter++;
            }
        }
        return result;
    }
}