/*
https://leetcode.com/problems/reverse-string/submissions/1901027017/

Approach:
1.Two Pointers:
    keep two pointer, one at left end and other at right . Iterate inside the loop once unitl the pointers meet
    use method like swapping of two numbers using temporary variable in the loop
    increment the left and right pointer for the next step iteration

2.Logic:
    Use Two pointer approcah and iterate inside the loop to get the desired reversed string


*/
class Solution
{
    public void reverseString(char[] s)
    {
        int l=0;
        int r=s.length-1;
        while(l<r)
        {
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r--;
        }

    }
}

/*
Time complexity:
O(n)
Best:O(n)
Average:O(n)
Worst:O(n)

Space Complexity:
O(1)
*/