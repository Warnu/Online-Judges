// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: Create Target Array in the Given Order
// Problem Link: https://leetcode.com/problems/create-target-array-in-the-given-order/

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[nums.length];
        
        for(int i=0; i<nums.length; i++) list.add(index[i], nums[i]);
        for(int i=0; i<nums.length; i++) result[i]= list.get(i);
        
        return result;
    }
}