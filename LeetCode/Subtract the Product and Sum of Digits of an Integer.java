// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: Subtract the Product and Sum of Digits of an Integer
// Problem Link: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

class Solution {
    public int subtractProductAndSum(int n) {
        char[] t3 = Integer.toString(n).toCharArray();
        int totalmultiplication = Integer.parseInt(Character.toString(t3[0]));
        int totaladdition = Integer.parseInt(Character.toString(t3[0]));
        for(int i=1; i<t3.length;i++){
            totalmultiplication *= Integer.parseInt(Character.toString(t3[i]));
            totaladdition += Integer.parseInt(Character.toString(t3[i]));
        }
        return totalmultiplication-totaladdition;
    }
}