/*
https://leetcode.com/problems/powx-n/submissions/1911540938/
Approach:
    Recuursion
Logic:
    As this is a power fn if we get the value in negative we first have to convert it to positive
reduce the power by half and at each iteration square the base and reduce the power.

*/
class Solution {
    public double myPow(double x, int n) {
        long N = n;          
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double result = 1.0;
        while (N > 0) {
            if (N % 2 == 1) {
                result *= x;
            }
            x *= x;
            N /= 2;
        }
        return result;
    }
}

/* 
Time complexity:
Best:O(n)
Average:O(n)
Worst:O(n)
Space Complexity:O(1)
*/