/*
https://leetcode.com/problems/maximum-average-subarray-i/

Aprroach:
    Sliding window
Logic:
    Declare the loop for the window sum and iterate inside the another loop and by comparing it with max
    value of windowsum and avg . Then return double of avg/k so that it divides by k.

*/
class Solution {
    public double findMaxAverage(int[] nums, int k)
    {
     int ws=0;
     int i;
     int n=nums.length;
     for( i=0;i<k;i++)
     {
        ws+=nums[i];
     }
     int maxavg=ws;
     for( i=k;i<n;i++)
     {
        ws=ws+nums[i]-nums[i-k];
        
        maxavg=Math.max(maxavg,ws);
     }
     return maxavg/k;
    
    }
}
/*
Time complexity:
Best:O(n)
Average:O(n)
Worst:O(n)
Space Complexity:O(1)
*/