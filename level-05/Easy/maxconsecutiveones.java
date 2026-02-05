/*
https://leetcode.com/problems/max-consecutive-ones/
Appraoch:
    Greedy
Logic:
    count variable used to count no of current ones.
    max gives max consecutive ones seen so far
    traverse the array and if satisfies go to next and move else compare

*/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for(int i : nums) {
            if(i == 1) count++;
            else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        if(count > max) 
        return count;
        return max;
    }
}
/* 
Time complexity:
Best:O(n)
Average:O(n)
Worst:O(n)
Space Complexity:O(1)
*/