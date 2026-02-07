/*
https://leetcode.com/problems/powx-n/submissions/1911540938/
Approach:
    Recuursion
Logic:
    As this is a power fn if we get the value in negative we first have to convert it to positive
reduce the power by half and at each iteration square the base and reduce the power.

*/

/* 
Time complexity:
Best:O(n)
Average:O(n)
Worst:O(n)
Space Complexity:O(1)
*/