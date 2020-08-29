// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: Split a String in Balanced Strings
// Problem Link: https://leetcode.com/problems/split-a-string-in-balanced-strings/

class Solution {
    public int balancedStringSplit(String s) {
        int control1=0;
        int control2=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='L')
                control1++;
            else
                control2++;
            if(control1 == control2){
                count++;
                control1=0;
                control2=0;
            }
        }
        return count;
    }
}