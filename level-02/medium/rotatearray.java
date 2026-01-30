/*
https://leetcode.com/problems/rotate-array/submissions/1902187687/

Approach:
    first reverse the entire array , then the first k elements then the remaining array 

Logic:
    use a sepearte fn and then access the array 
*/
class Solution
{
    public void rotate(int [] nums,int k)
    {
        int n=nums.length;
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    
    }
    private void reverse(int [] nums,int l, int r)
    {
        whilr(l<r)
        {
            int t=nums[l];
            int l=nums[r];
            int[r]=t;
            l++;
            r--;
        }
    }
}

/*
Time complexity:
Best:O(n)	
Average:O(n)	 
Worst:O(n)
Space Complexity:
O(1)
 */