// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: XOR Operation in an Array
// Problem Link: https://leetcode.com/problems/xor-operation-in-an-array/

class Solution {
    public int xorOperation(int n, int start) {
        int ret = 0;
        for (int i = 0; i < n; i++) 
            ret ^= start + (i * 2);
        return ret;
    }
}