/*
https://leetcode.com/problems/fibonacci-number/
Approach:
    Recurrsion
Logic:
    use sum of (n-1) and (n-2) to get the value of the series as fibonocci series is the sum of previous numbers.
    for n=0 and 1 return the number itself.
*/
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
        
    }
}
/* 
Time complexity:
Best:O(2^n)
Average:O(2^n)
Worst:O(2^n)
Space Complexity:O(n)
*/