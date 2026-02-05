/* 
https://leetcode.com/problems/sort-colors/
Aprroach:
Two pointers and swapping of numbers
Logic:
First declare a middle element inside the loop check whether the number is less than mid or not if 
lesser swap the number mid and high
then if equal to mid increment it and else swap low and mid
*/
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else { 
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}

/*
Time complexity:
Best:O(n)
Average:O(log n)
Worst:O(log n)
Space Complexity:O(1)

*/