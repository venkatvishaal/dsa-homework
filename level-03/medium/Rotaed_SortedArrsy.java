/*
https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1907097378/
Approach:
Binary search
Logic:
Since the integer array is sorted in ascending order. The nums array is rotated left by k prior.
we have to first find the roated array after roating left by k index and the search for the array.
we check whether the number in left or right of the target is sorted.

*/
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
    