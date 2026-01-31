
import javax.lang.model.util.ElementScanner14;

/*
https://leetcode.com/problems/binary-search/

Approach:
    We need to first find the middle element , if that element is equal to our target we return that, else we search 
    both left and right so that we find the target element
Logic:
    mid == target : return mid
    mid < target :return mid+1
    mid > target : return mid-1

*/

class Solution
{
    public int search(int [] nums, int target)
    {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int mid=0;
        while(l<r)
        {
            mid =l+(r-l)/2;
            if(nums{mid}==target)
                {
                    return mid;
                }   
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1
            }
        }
        return -1;
    }
}

/*
Time Complexity:
    Best:O(1)
    Average:O(LogN)
    Worst:O(LogN)

Space Complexity:O(1)
*/