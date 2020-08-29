// Author: Oreste Arredondo
// Source: LeetCode ( https://www.leetcode.com )
// Problem Name: Number of Steps to Reduce a Number to Zero
// Problem Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

class Solution {
    public int numberOfSteps (int num) {
        int counter=0;
        while(num !=0){
            if(num % 2==0){
                num/=2;
                counter++;
            }
            else{
                num -=1;
                counter++;
            }
        }
        return counter;
    }
}